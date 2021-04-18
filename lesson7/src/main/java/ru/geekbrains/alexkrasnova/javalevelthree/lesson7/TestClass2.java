package ru.geekbrains.alexkrasnova.javalevelthree.lesson7;

public class TestClass2 {

    @BeforeSuite
    public static void beforeSuiteMethod() {
        System.out.println("Старт запусука методов из класса TestClass2");
    }

    @AfterSuite
    public static void afterSuiteMethod() {
        System.out.println("Конец запусука методов из класса TestClass2");
    }

    @Test(priority = 4)
    public static void method1() {
        System.out.println("Тест с приоритетом 4");
    }

    @Test(priority = 4)
    public static void method2() {
        System.out.println("Тест с приоритетом 4");
    }

    @Test(priority = 56)
    public static void method3() {
        System.out.println("Тест с приоритетом 56");
    }

    @Test(priority = 5)
    public static void method4() {
        System.out.println("Тест с приоритетом 5");
    }

    @Test(priority = 5)
    public static void method5() {
        System.out.println("Тест с приоритетом 5");
    }

}
