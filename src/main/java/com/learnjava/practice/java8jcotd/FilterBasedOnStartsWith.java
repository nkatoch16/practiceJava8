package com.learnjava.practice.java8jcotd;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterBasedOnStartsWith {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Apricot", "Orange");
        System.out.println(strings.stream().filter(e->e.startsWith("A")).collect(Collectors.toList()));
    }

}
