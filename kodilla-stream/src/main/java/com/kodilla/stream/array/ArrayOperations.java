package com.kodilla.stream.array;

import java.util.Arrays;
import java.util.stream.IntStream;

public interface ArrayOperations {
    public static double getAverage(int[] numbers){

        IntStream stream = Arrays.stream(numbers);
        stream.forEach(i -> System.out.println(i));

        IntStream stream2 = Arrays.stream(numbers);
        return stream2.average().getAsDouble();
    }
}
