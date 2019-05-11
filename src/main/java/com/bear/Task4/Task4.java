package com.bear.Task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        long a = 25214903917L;
        long c = 11L;
        long m = (long) Math.pow(2, 48);

        List<Long> numbersFromInfiniteStream = getInfiniteStream(a, c, m)
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(numbersFromInfiniteStream);
    }

    private static Stream<Long> getInfiniteStream(long a, long c, long m) {
        return Stream.iterate(0L, n -> ((a * n + c) % m));
    }
}
