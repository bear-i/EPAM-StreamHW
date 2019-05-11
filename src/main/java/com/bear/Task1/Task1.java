package com.bear.Task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task1 {
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

        String oddsNames = getOddsNames(names);
        System.out.println(oddsNames);
    }

    private static String getOddsNames(List<String> names) {
        return IntStream
                .range(1, names.size())
                .filter(index -> index % 2 != 0)
                .mapToObj(index -> String.format("%d. %s ", index, names.get(index - 1)))
                .collect(Collectors.joining());
    }
}
