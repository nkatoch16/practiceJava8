package com.learnjava.practice;

import java.util.List;
import java.util.TreeSet;

public class TreeSetProblem {
    public static void main(String[] args) {
        Employee e1 = new Employee(1, "Ram", 50000, "Dev", List.of(new Address("Hamirpur", "HP", 177001)));
        Employee e2 = new Employee(2, "Shyam", 60000, "Ops", List.of(new Address("Hamirpur", "HP", 177001)));
        Employee e3 = new Employee(3, "Ghanshyam", 80000, "Mangmt", List.of(new Address("Hamirpur", "HP", 177001)));

        TreeSet<Employee> employees = new TreeSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);

        System.out.println(employees);
    }

}
