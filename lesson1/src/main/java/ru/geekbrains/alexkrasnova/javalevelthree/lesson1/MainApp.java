package ru.geekbrains.alexkrasnova.javalevelthree.lesson1;

import ru.geekbrains.alexkrasnova.javalevelthree.lesson1.fruit.Apple;
import ru.geekbrains.alexkrasnova.javalevelthree.lesson1.fruit.Orange;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        testBoxes();
        testArrayFunctions();

    }

    public static void testBoxes() {
        Box<Apple> boxWithApples = new Box<>();
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());
        boxWithApples.addFruit(new Apple());

        Box<Apple> boxWithApples2 = new Box<>();

        Box<Apple> boxWithApples3 = new Box<>();
        boxWithApples3.addFruit(new Apple());
        boxWithApples3.addFruit(new Apple());

        Box<Orange> boxWithOranges = new Box<>();
        boxWithOranges.addFruit(new Orange());
        boxWithOranges.addFruit(new Orange());
        boxWithOranges.addFruit(new Orange());
        boxWithOranges.addFruit(new Orange());

        System.out.println(boxWithApples.compareTo(boxWithOranges));
        System.out.println(boxWithApples.compareTo(boxWithApples2));
        System.out.println(boxWithOranges.compareTo(boxWithApples3));
        System.out.println(boxWithApples.compareTo(boxWithApples3));
        boxWithApples.pourTo(boxWithApples2);
    }

    public static void testArrayFunctions() {
        String[] array1 = {"A", "B", "C"};
        swapArrayElements(1, 2, array1);
        Float[] array2 = {0.1f, 1f, 3.3f, 5.5f, 1.5f, 1.4f, 7f, 5f, 3.5f, 10f};
        swapArrayElements(5, 9, array2);
    }

    public static <T> void swapArrayElements(int index1, int index2, T... array) {
        if (index1 < array.length && index2 < array.length) {
            T tempElement = array[index1];
            array[index1] = array[index2];
            array[index2] = tempElement;
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public static <T> List<T> transformArrayToArrayList(T... array) {
        List<T> arrayList = new ArrayList<>();
        arrayList = Arrays.asList(array);
        return arrayList;
    }

}
