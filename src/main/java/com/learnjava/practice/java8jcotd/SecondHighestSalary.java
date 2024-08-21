package com.learnjava.practice.java8jcotd;

import java.util.Comparator;
import java.util.List;

public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1)
                .findFirst().orElse(null));
    }
}
