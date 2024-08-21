package com.learnjava.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find duplicate elements in a string
public class Java8Problem2DuplicateCharsInString {
    public static void main(String[] args) {
        String str = "ilovejavaprogramming";

        System.out.println(str.chars().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()>1).map(Map.Entry::getKey).collect(Collectors.toList()));
    }

}
