package com.learnjava.practice.java8jcotd;

import java.util.Comparator;
import java.util.List;

//Query 8 : Get the details of youngest male employee in the product development department?
public class YoungestEmployeeInADept {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeUtil.employees();
        System.out.println(employees.stream().min(Comparator.comparing(Employee::getAge)));
        System.out.println(employees.stream()
                .filter(e->e.getGender().equalsIgnoreCase("Male")
                        && e.getDepartment().equalsIgnoreCase("Product Development"))
                .min(Comparator.comparingInt(Employee::getAge)));
    }
}
