package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class ArrayOperationsTestSuite {

    @Test
    public void testGetAverage() {

        int[] numbers = IntStream.range(1, 20).toArray();

        if (numbers.length > 0) {
            int sum = 0;
            double average;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];
            }

            average = (double) sum / numbers.length;
            Assert.assertEquals(average, ArrayOperations.getAverage(numbers), 0.0);
        } else {
            double average = 0;
            Assert.assertEquals(average, ArrayOperations.getAverage(numbers), 0.0);
        }
    }
}

