package com.learnjava.practice.java8jcotd;

import java.util.Arrays;
import java.util.List;

public class AverageLengthOfStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Java", "Python", "C++", "JavaScript", "Ruby");
        System.out.println(strings.stream().mapToDouble(String::length).average().orElse(0));
    }
}
