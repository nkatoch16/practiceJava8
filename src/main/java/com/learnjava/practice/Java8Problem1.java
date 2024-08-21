package com.learnjava.practice;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

//Count occurrence of each character in a string

public class Java8Problem1 extends Alpha{
    private Java8Problem1(){
        s = "subsub";
    }
    public static void main(String[] args) {
        String str = "ilovejavaprogramming";

        System.out.println(str.chars().mapToObj(c -> ((char) c))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        List<String> cities = List.of("Delhi", "Mumbai", "Chennai", "Kolkata");
        //"Delhi,Mumbai,Chennai,Kolkata"

        System.out.println(cities.stream().collect(Collectors.joining(",")));

        System.out.println(cities.stream().reduce((a,b)-> a+","+b).get());

        System.out.println(String.join(",", cities));

        System.out.println("no of cores :"+Runtime.getRuntime().availableProcessors());

        new Java8Problem1();
        System.out.println(s);
    }
}

class Alpha{
    static String s ="";
    protected Alpha(){
        s = "Alpha";
    }
}
class SubAlpha extends Alpha{
    private SubAlpha(){
        s = "sub";
    }
}