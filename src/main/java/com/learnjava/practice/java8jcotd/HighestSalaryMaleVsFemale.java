package com.learnjava.practice.java8jcotd;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

//Query 11 : What is the average salary of male and female employees?
public class HighestSalaryMaleVsFemale {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.averagingDouble(Employee::getSalary))));

        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender,
                        Collectors.minBy(Comparator.comparing(Employee::getSalary)))));
    }
}
