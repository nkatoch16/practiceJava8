package com.learnjava.practice.java8jcotd;

import java.util.List;
import java.util.stream.Collectors;

//Query 3.12 : List down the names of all employees in each department?
public class AllEmployeesInaDept {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream().collect(Collectors.groupingBy(Employee::getDepartment)));

        employees.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment)).entrySet()
                .forEach(e->{
                    System.out.println("--------------------------------------");

                    System.out.println("Employees In "+e.getKey() + " : ");

                    System.out.println("--------------------------------------");

                    List<Employee> list = e.getValue();
                    list.forEach(k->{
                        System.out.println(k.getName());
                    });

    });

        /*for (Map.Entry<String, List<Employee>> entry : entrySet)
        {
            System.out.println("--------------------------------------");

            System.out.println("Employees In "+entry.getKey() + " : ");

            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }*/

    }
}
