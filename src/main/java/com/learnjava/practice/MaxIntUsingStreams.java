package com.learnjava.practice;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MaxIntUsingStreams {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5);

        System.out.println(numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).get(1));
        Optional<Integer> max = numbers.stream().max(Integer::compare);
        Optional<Integer> max2 = numbers.stream().max(Comparator.comparing(Integer::intValue));
        System.out.println("Maximum value: " + max.get());

        System.out.println("Maximum value 2: " + max2.get());


        OptionalDouble average = numbers.stream().mapToInt(Integer::intValue).average();
        if (average.isPresent()) {
            System.out.println("Average: " + average.getAsDouble());
        } else {
            System.out.println("List is empty");
        }

        Optional<Integer> maximum = numbers.stream().sorted(Comparator.reverseOrder()).findFirst();
        if (maximum.isPresent()) {
            System.out.println("Maximum value: " + maximum.get());
        } else {
            System.out.println("List is empty");
        }
    }
}
