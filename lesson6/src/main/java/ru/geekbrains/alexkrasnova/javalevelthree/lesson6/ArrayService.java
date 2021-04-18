package ru.geekbrains.alexkrasnova.javalevelthree.lesson6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayService {

    public static int[] cutByLastFour(int... array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("");
        }

        List<Integer> arrayList = new ArrayList<>();
        for (int j : array) {
            arrayList.add(j);
        }

        if (arrayList.contains(4)) {
            int[] tempArray = Arrays.copyOfRange(array, arrayList.lastIndexOf(4) + 1, array.length);
            return tempArray;
        }
        throw new RuntimeException("В массиве нет числа 4");
    }

    public static boolean checkOneAndFourArray(int... array) {
        int oneCounter = 0;
        int fourCounter = 0;
        for (int j : array) {
            if (j != 1 && j != 4) {
                return false;
            }
            if (j == 1) {
                oneCounter++;
            }

            if (j == 4) {
                fourCounter++;
            }
        }
        if (oneCounter > 0 && fourCounter > 0) {
            return true;
        }
        return false;
    }
}
