package ru.geekbrains.alexkrasnova.javalevelthree.lesson7;

public class TestClass1 {

    @BeforeSuite
    public static void beforeSuiteMethod() {
        System.out.println("Старт запусука методов из класса TestClass1");
    }

    @AfterSuite
    public static void afterSuiteMethod() {
        System.out.println("Конец запусука методов из класса TestClass1");
    }

    @Test(priority = 3)
    public static void method3() {
        System.out.println("Тест с приоритетом 3");
    }

    @Test(priority = 1)
    public static void method1() {
        System.out.println("Тест с приоритетом 1");
    }

    @Test(priority = 2)
    public static void method2() {
        System.out.println("Тест с приоритетом 2");
    }

    @Test(priority = 2)
    public static void method4() {

        System.out.println("Тест с приоритетом 2");
    }

    @Test(priority = 20)
    public static void method5() {
        System.out.println("Тест с приоритетом 20");
    }

    @Test(priority = 7)
    public static void method6() {
        System.out.println("Тест с приоритетом 7");
    }

    @Test(priority = 3)
    public static void method7() {
        System.out.println("Тест с приоритетом 3");
    }

    @Test(priority = 10)
    public static void method8() {
        System.out.println("Тест с приоритетом 10");
    }

    @Test(priority = 10)
    public static void method9() {
        System.out.println("Тест с приоритетом 10");
    }

    @Test(priority = 5)
    public static void method10() {
        System.out.println("Тест с приоритетом 5");
    }

    @Test(priority = 2)
    public static void method11() {
        System.out.println("Тест с приоритетом 2");
    }

    @Test(priority = 2)
    public static void method12() {
        System.out.println("Тест с приоритетом 2");
    }
}
