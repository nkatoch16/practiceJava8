package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;

//Query 2 : Print the name of all departments in the organization?
public class PrintAllDepartments {

    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        employees.stream().map(Employee::getDepartment).collect(Collectors.toSet()).forEach(System.out::println);
        System.out.println("-------------------------------------------");
        employees.stream().map(Employee::getDepartment).distinct().forEach(System.out::println);
    }
}
