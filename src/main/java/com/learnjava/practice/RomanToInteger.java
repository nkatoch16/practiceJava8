package com.learnjava.practice;

import java.util.Map;

public class RomanToInteger {
    static Map<String, Integer> romanToInteger = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );
    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
    }

    public static int romanToInt(String roman) {

        switch (roman.substring(0,1)){
            case "I" :

        }

        return 4;
    }
}
