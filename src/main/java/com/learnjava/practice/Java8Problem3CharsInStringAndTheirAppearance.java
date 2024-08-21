package com.learnjava.practice;

import java.util.LinkedHashMap;
import java.util.function.Function;
import java.util.stream.Collectors;

//Find first non-repeat element from the String
public class Java8Problem3CharsInStringAndTheirAppearance {
    public static void main(String[] args) {
        String str = "ilovejavaprogramming";

        System.out.println(str.chars().mapToObj(c -> String.valueOf((char) c))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(x -> x.getValue()>1).findFirst().get().getKey());
    }
}
