package com.learnjava.practice.java8jcotd;

import java.util.List;

//Query 5 : Get the names of all employees who have joined after 2015?
public class EmployeeJoinedAfterDate {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        employees.stream()
                .filter(e->e.getYearOfJoining()>2015)
                .map(Employee::getName).forEach(System.out::println);
    }
}
