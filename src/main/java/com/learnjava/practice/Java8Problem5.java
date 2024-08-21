package com.learnjava.practice;

public class Java8Problem5 {

}

interface I1 {
    default String getGreeting() {
        return "Good Morning!";
    }
}

interface I2 {
    default String getGreeting() {
        return "Good Night!";
    }
}

class C1 implements I1, I2 {


    @Override
    public String getGreeting() {
        return I1.super.getGreeting();
    }
}
