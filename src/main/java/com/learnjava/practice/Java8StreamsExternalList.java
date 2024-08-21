package com.learnjava.practice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8StreamsExternalList {
    public static void main(String[] args) {
        List<String> destList = new ArrayList<>(Arrays.asList("foo"));
        List<Integer> newList = IntStream.range(1,100).boxed().collect(Collectors.toList());
        Long timenow = System.currentTimeMillis();
        newList.stream()
                .map(Java8StreamsExternalList::changeToString)
                .map(Java8StreamsExternalList::addExtraString)
                .forEachOrdered(destList::add);
        System.out.println("time taken  : "+(System.currentTimeMillis() - timenow));
        System.out.println(destList.size());
        System.out.println(destList);
        System.out.println(LocalDate.now().minusDays(400).minusMonths(1));
    }

    private static String addExtraString(String e) {
        return e+"e";
    }

    private static String changeToString(Integer e) {
        try {
            Thread.sleep(500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        return String.valueOf(e);
    }

     /*System.out.println(strList.stream().collect(Collectors.toMap(x ->x, x-> x.length())));
        System.out.println(strList.stream().collect(Collectors
                    .groupingBy(Function.identity(), Collectors.counting())));
        System.out.println(strList.stream().reduce((x,y)-> (x.length() > y.length())? x : y).get());
        System.out.println(strList.stream().reduce("", (x,y) -> (x.length() > y.length()? x:y)));
        */
}
