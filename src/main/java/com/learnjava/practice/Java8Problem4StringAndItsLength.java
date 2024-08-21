package com.learnjava.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Problem4StringAndItsLength {
    public static void main(String[] args) {
        List<String> strList = Arrays.asList("Java","is","wonderful","language");

        System.out.println(strList.stream().collect(Collectors.toMap(x -> x, String::length)));
        System.out.println(strList.stream().collect(Collectors.toMap(Function.identity(), String::length)));

        System.out.println(strList.stream().max(Comparator.comparing(String::length)));

    }
}
