package com.learnjava.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ParallelStreamExample {
    public static void main(String[] args) {
        /*List<String> names  = DataSet.namesList();
        List<String> namesModified = names.parallelStream().map(e-> e.length()+"-"+e).collect(Collectors.toList());
        System.out.println(names.stream().map(s->s.concat(",")).collect(Collectors.joining()));
        String s = "LALAL";
        System.out.println(namesModified);*/

        List <Integer> intList = Arrays.asList(1,6,3,4,6,7,8,3);

        System.out.println(intList.stream().map(x->x+"").collect(Collectors.joining(", ")));
    }
}
