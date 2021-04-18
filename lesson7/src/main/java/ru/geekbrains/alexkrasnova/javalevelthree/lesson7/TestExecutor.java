package ru.geekbrains.alexkrasnova.javalevelthree.lesson7;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class TestExecutor {
    public static void start(Class cl) throws IllegalAccessException, InvocationTargetException {

        List<Method> methodList = Arrays.asList(cl.getDeclaredMethods());

        List<Method> beforeSuiteMethodList = new ArrayList<>();
        List<Method> afterSuiteMethodList = new ArrayList<>();

        List<Method> testMethodList = new ArrayList<>();
        for (Method m : methodList) {
            if (m.isAnnotationPresent(Test.class)) {
                testMethodList.add(m);
            } else if (m.isAnnotationPresent(BeforeSuite.class)) {
                beforeSuiteMethodList.add(m);
            } else if (m.isAnnotationPresent(AfterSuite.class)) {
                afterSuiteMethodList.add(m);
            }
        }

        if (beforeSuiteMethodList.size() != 1 || afterSuiteMethodList.size() != 1) {
            throw new RuntimeException("Некорректное количество методов с аннотацией @BeforeSuite и(или) @AfterSuite");
        }

        beforeSuiteMethodList.get(0).invoke(null);

        testMethodList.sort((m1, m2) -> {
            if (m1.getAnnotation(Test.class).priority() < m2.getAnnotation(Test.class).priority()) {
                return -1;
            } else if (m1.getAnnotation(Test.class).priority() > m2.getAnnotation(Test.class).priority()) {
                return 1;
            }
            return 0;
        });

        for (Method m : testMethodList) {
            m.invoke(null);
        }

        afterSuiteMethodList.get(0).invoke(null);
    }
}
