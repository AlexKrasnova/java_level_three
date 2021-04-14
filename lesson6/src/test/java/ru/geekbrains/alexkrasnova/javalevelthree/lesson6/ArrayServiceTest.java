package ru.geekbrains.alexkrasnova.javalevelthree.lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayServiceTest {

    @ParameterizedTest
    @MethodSource("argsCutArray")
    public void cutByLastFour_arrayIsNotNullAndContainsAtLeastOneFour_successfullyCut(int[] expectedArray, int[] array) {
        Assertions.assertArrayEquals(expectedArray, ArrayService.cutByLastFour(array));
    }

    public static Stream<Arguments> argsCutArray() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{5, 6, 7}, new int[]{1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 5, 6, 7}));
        out.add(Arguments.arguments(new int[]{1}, new int[]{1, 4, 1, 2, 3, 4, 1}));
        out.add(Arguments.arguments(new int[]{5}, new int[]{3, 4, 4, 5}));
        out.add(Arguments.arguments(new int[]{5, 6}, new int[]{4, 5, 6}));
        return out.stream();
    }

    @Test
    public void cutByLastFour_arrayDoesNotContainFour_throwsRuntimeException() {
        Assertions.assertThrows(RuntimeException.class, () -> {
            ArrayService.cutByLastFour(1, 2, 3);
        });
    }

    @Test
    public void cutByLastFour_arrayHasZeroLength_throwsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ArrayService.cutByLastFour(new int[]{});
        });
    }

    @Test
    public void cutByLastFour_arrayIsNull_throwsIllegalArgumentException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            ArrayService.cutByLastFour(null);
        });
    }

    @ParameterizedTest
    @MethodSource("oneAndFourArrayArgs")
    public void checkOneAndFourArray_arrayContainsOnlyOneAndFourOrContainsDifferentNumbers_trueOrFalse(int[] array, boolean expectedAnswer) {
        Assertions.assertEquals(expectedAnswer, ArrayService.checkOneAndFourArray(array));
    }

    public static Stream<Arguments> oneAndFourArrayArgs() {
        List<Arguments> out = new ArrayList<>();
        out.add(Arguments.arguments(new int[]{1, 1, 1, 1}, false));
        out.add(Arguments.arguments(new int[]{1, 4, 1, 1}, true));
        out.add(Arguments.arguments(new int[]{4, 4, 4, 4, 4, 4, 4, 4, 4, 4, 1}, true));
        out.add(Arguments.arguments(new int[]{5, 1, 4, 4, 4, 1, 1, 1, 1, 1}, false));
        out.add(Arguments.arguments(new int[]{4, 4,}, false));
        return out.stream();
    }
}
