package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;
//Query 3 : What is the average age of male and female employees?
public class AverageAgeMaleVsFemale {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();

        System.out.println(employees.stream().map(Employee::getAge).mapToDouble(i-> i).average().orElse(0));
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge))));

    }
}
