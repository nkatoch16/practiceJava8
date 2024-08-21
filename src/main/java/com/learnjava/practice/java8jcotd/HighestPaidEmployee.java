package com.learnjava.practice.java8jcotd;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

//Query 4 : Get the details of highest paid employee in the organization?
public class HighestPaidEmployee {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();

        System.out.println(employees.stream()
                .mapToDouble(Employee::getSalary).max().orElse(0));
        System.out.println(employees.stream().max(Comparator.comparing(Employee::getSalary)));


        Optional<Employee> highestPaidEmployeeWrapper=
                employees.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary)));

        Employee highestPaidEmployee = highestPaidEmployeeWrapper.get();

        System.out.println("Details Of Highest Paid Employee : ");

        System.out.println("==================================");

        System.out.println("ID : "+highestPaidEmployee.getId());

        System.out.println("Name : "+highestPaidEmployee.getName());

        System.out.println("Age : "+highestPaidEmployee.getAge());

        System.out.println("Gender : "+highestPaidEmployee.getGender());

        System.out.println("Department : "+highestPaidEmployee.getDepartment());

        System.out.println("Year Of Joining : "+highestPaidEmployee.getYearOfJoining());

        System.out.println("Salary : "+highestPaidEmployee.getSalary());
    }
}
