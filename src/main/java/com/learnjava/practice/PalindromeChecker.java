package com.learnjava.practice;

import java.util.stream.IntStream;

public class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); // Remove non-alphanumeric characters and lowercase
        int length = cleanedStr.length();

        return IntStream.range(0, length / 2)
                .allMatch(i -> cleanedStr.charAt(i) == cleanedStr.charAt(length - i - 1));
    }

    public static void main(String[] args) {
        String input = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(input)); // Prints true
    }
}