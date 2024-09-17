package com.learnjava.others;

import java.util.function.Function;
import java.util.stream.Collectors;

public class EvenFrequencyCharacters {
    public static void main(String[] args) {
        String str = "aabbbccccdeeffg";
        printEvenFrequencyChars(str);
    }

    private static void printEvenFrequencyChars(String str) {
        str.chars().mapToObj(c->(char)c)
                .collect(Collectors
                        .groupingBy(Function.identity(),
                                Collectors.counting())).entrySet()
                .stream().filter(e -> e.getValue()%2==0).forEach(
                        es -> System.out.println(es.getKey())
                );
    }
}
