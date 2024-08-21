package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;

//Query 6 : Count the number of employees in each department?
public class EmployeesInEachDept {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();

        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting())));
    }
}
