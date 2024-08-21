package com.learnjava.practice.java8jcotd;

import java.util.stream.IntStream;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = "madame";
        System.out.println(IntStream.range(0, str.length())
                .allMatch(e-> str.charAt(e) == str.charAt(str.length()-e-1)));

    }
}
