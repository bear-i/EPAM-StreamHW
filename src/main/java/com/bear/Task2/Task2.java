package com.bear.Task2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Ivan");
        names.add("Alice");
        names.add("Ian");
        names.add("Elena");
        names.add("Caroline");
        names.add("Claus");
        names.add("Hope");

        List<String> modificatedNames = getModificatedAndSortedNames(names);
        System.out.println(modificatedNames);
    }

    private static List<String> getModificatedAndSortedNames(List<String> names) {
        return names.stream()
                .map(String::toUpperCase)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
