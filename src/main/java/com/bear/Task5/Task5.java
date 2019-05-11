package com.bear.Task5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Peter");
        names.add("Ivan");
        names.add("Alice");
        Stream<String> namesStream = names.stream();
        List<String> names2 = new ArrayList<>();
        names2.add("Elena");
        names2.add("Caroline");
        names2.add("Claus");
        names2.add("Hope");
        Stream<String> names2Stream = names2.stream();

        List<String> concatLists = zip(namesStream, names2Stream).collect(Collectors.toList());
        System.out.println(concatLists);
    }

    private static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Stream<T> concatStream = Stream.empty();
        Iterator<T> iterator1 = first.iterator();
        Iterator<T> iterator2 = second.iterator();

        while (iterator1.hasNext() && iterator2.hasNext()) {
            concatStream = Stream.concat(concatStream, Stream.of(iterator1.next(), iterator2.next()));
        }

        return concatStream;
    }
}
