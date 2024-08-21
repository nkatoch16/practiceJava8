package com.learnjava.practice;

import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample02feb {
    public static void main(String[] args) {
        String name = "akaytab";
        System.out.println(name.chars().mapToObj(c->(char)c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
        );
    }
}
