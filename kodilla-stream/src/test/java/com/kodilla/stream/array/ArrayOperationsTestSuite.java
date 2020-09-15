package com.kodilla.stream.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {
        //Given
        //declare new Array
        int numbers[] = new int[20];

        //When
        //put the numbers to new Array (0-19)
        for (int i = 0; i < 20; i++) {
            numbers[i] = i;
        }
        IntStream.range(0, numbers.length)
                .forEach(n -> System.out.println());
        OptionalDouble averageNew = IntStream.range(0, numbers.length)
                .average();

        //Then
        Assertions.assertEquals(9.50, averageNew);

    }
}
