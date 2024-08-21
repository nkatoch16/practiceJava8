package com.learnjava.practice.java8jcotd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementsOfListToUpperCase {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("java", "python", "c++", "javascript");
        System.out.println(strings.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
