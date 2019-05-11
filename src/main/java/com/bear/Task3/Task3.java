package com.bear.Task3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1, 2, 0", "4, 5");

        List<String> separatedNumbers = getSeparatedNumbers(numbers);
        System.out.println(separatedNumbers);
    }

    private static List<String> getSeparatedNumbers(List<String> numbers) {
        return numbers.stream()
                .flatMap(element -> Arrays.asList(element.split(",")).stream())
                .collect(Collectors.toList());
    }
}
