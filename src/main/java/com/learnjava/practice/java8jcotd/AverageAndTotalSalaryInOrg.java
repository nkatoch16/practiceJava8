package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;

//Query 13 : What is the average salary and total salary of the whole organization?
public class AverageAndTotalSalaryInOrg {
    public static void main(String[] args) {        List<Employee> employees = EmployeeUtil.employees();

        System.out.println(employees.stream().map(Employee::getSalary).mapToDouble(i->i).summaryStatistics());
        System.out.println(employees.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));
    }
}
