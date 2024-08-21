package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;

//Query 14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
public class SeparatingEmployeesBasedOnAge {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)));
        employees.stream().collect(Collectors.partitioningBy(e->e.getAge()>25)).entrySet().forEach(k->{
            System.out.println("----------------------------");

            if (k.getKey())
            {
                System.out.println("Employees older than 25 years :");
            }
            else
            {
                System.out.println("Employees younger than or equal to 25 years :");
            }

            System.out.println("----------------------------");

            k.getValue().forEach(d->{
                System.out.println(d.getName());
            });
        });
    }
}
