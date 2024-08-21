package com.learnjava.practice.java8jcotd;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupStringsBasedOnTheLength {
    public static void main(String[] args) {

        List<String> strings = Arrays.asList("Java", "Go", "Python", "C", "Ruby");
        Map<Boolean, List<String>> partitioned = strings.stream().collect(Collectors.partitioningBy(e->e.length()>3));
        System.out.println("Strings with length > 3: " + partitioned.get(true));

        System.out.println("Strings with length <= 3: " + partitioned.get(false));
    }
}
