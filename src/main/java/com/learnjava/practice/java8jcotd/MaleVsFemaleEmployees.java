package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;

//Query 1 : How many male and female employees are there in the organization?
public class MaleVsFemaleEmployees {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();

        System.out.println(employees.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting())));
        System.out.println(employees.stream()
                .collect(Collectors.partitioningBy(e->e.getGender().equalsIgnoreCase("Male"))));

    }
}
