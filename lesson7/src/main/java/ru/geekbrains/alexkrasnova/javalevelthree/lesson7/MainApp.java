package ru.geekbrains.alexkrasnova.javalevelthree.lesson7;

import java.lang.reflect.InvocationTargetException;

public class MainApp {
    public static void main(String[] args) {
        try {
            TestExecutor.start(TestClass1.class);
            TestExecutor.start(TestClass2.class);
        } catch (IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
