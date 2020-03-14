package com.kodilla.stream.array;

        import java.util.Arrays;
        import java.util.stream.IntStream;

public interface ArrayOperations {
    static double getAverage(int[] numbers) {

        if (numbers != null && numbers.length > 0) {
            IntStream stream = Arrays.stream(numbers);
            stream.forEach(i -> System.out.println(i));

            IntStream stream2 = Arrays.stream(numbers);
            return stream2.average().getAsDouble();
        } else {
            return 0;
        }
    }
}
