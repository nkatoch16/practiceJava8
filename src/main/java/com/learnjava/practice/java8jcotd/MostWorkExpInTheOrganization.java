package com.learnjava.practice.java8jcotd;

import java.util.Comparator;
import java.util.List;

//Query 9 : Who has the most working experience in the organization?
public class MostWorkExpInTheOrganization {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream()
                .min(Comparator.comparing(Employee::getYearOfJoining)));

        System.out.println(employees.stream()
                .sorted(Comparator.comparing(Employee::getYearOfJoining)).findFirst().get());
    }
}
