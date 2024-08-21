package com.learnjava.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> myList = Arrays.asList(10, 15, 8, 49, 25, 98, 98, 32, 15);
        Set<Integer> set = new HashSet();
        myList.stream().filter(n -> !set.add(n)).forEach(System.out::println);
        //myList.stream().sorted().forEach(System.out::println);
        System.out.println("Summary : "+myList.stream().mapToInt(Integer::intValue).summaryStatistics().getAverage());
        System.out.println("Average : "+myList.stream().mapToInt(Integer::intValue).average().getAsDouble());
        System.out.println("Duplicates "+myList.stream().filter(n->!set.add(n)).collect(Collectors.toList()));
    }
}