package com.learnjava.practice.java8jcotd;

import java.util.stream.IntStream;

public class PrimeCheck {
    public static void main(String[] args) {
        int num = 29; // You can change this number to test other values
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        boolean isPrimeJava8 = num > 1 && IntStream.rangeClosed(2, num/2)
                .noneMatch(i -> num % i == 0);

        if (isPrimeJava8) {
            System.out.println(num + " is a prime number Java8.");
        } else {
            System.out.println(num + " is not a prime number Java8.");
        }
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}