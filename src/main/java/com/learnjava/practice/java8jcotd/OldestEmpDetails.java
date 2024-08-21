package com.learnjava.practice.java8jcotd;

import java.util.Comparator;
import java.util.List;

//Query 15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
public class OldestEmpDetails {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream().max(Comparator.comparing(Employee::getAge)));
    }
}
