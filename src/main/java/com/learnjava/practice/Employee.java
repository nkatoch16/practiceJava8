package com.learnjava.practice;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private long salary;
    private String dept;
    private List<Address> address;

    @Override
    public int compareTo(Employee emp){
        return String.CASE_INSENSITIVE_ORDER.compare(this.getName(), emp.getName());
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", dept='" + dept + '\'' +
                '}';
    }
}
