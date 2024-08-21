package com.learnjava.practice.java8jcotd;

import java.util.Arrays;
import java.util.List;

public class SumOfEvenNums {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(numbers.stream().filter(e->e%2 == 0).reduce(Integer::sum));
        System.out.println(numbers.stream().filter(e->e%2 == 0).mapToInt(Integer::intValue).sum());
        System.out.println(numbers.stream().mapToInt(Integer::intValue).sum());

    }
}
