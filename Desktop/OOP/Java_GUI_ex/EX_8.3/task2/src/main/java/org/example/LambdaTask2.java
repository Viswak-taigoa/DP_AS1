package org.example;

import java.util.ArrayList;
import java.util.List;

public class LambdaTask2 {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(10, 5, 8, 20, 15, 3, 12));
        System.out.println("Original list: " + numbers);


        numbers.removeIf(number -> number % 2 == 0);
        System.out.println("After removing even numbers: " + numbers);


        numbers.replaceAll(number -> number * 2);
        System.out.println("After doubling odd numbers: " + numbers);


        int sum = numbers.stream().reduce(0, Integer::sum); // Using reduce
        System.out.println("Sum of numbers: " + sum);
    }
}
