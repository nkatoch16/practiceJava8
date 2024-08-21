package com.learnjava.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import static java.util.Map.Entry.comparingByValue;
import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.reducing;

public class NthHigestSalary {
    public static void main(String[] args) {
        Map<String, Integer> salaryMap = Map.of(
                "Emp1", 20005,
                "Emp2", 20050,
                "Emp3", 20050,
                "Emp4", 20030,
                "Emp5", 20050,
                "Emp6", 20050,
                "Emp7", 20800,
                "Emp8", 42000,
                "Emp9", 42000,
                "Emp99", 672000
        );
        List<Employee> employeeList = List.of(
                new Employee(1, "Ram", 50000, "Dev",
                        List.of(new Address("Hamirpur", "HP", 177001),
                                new Address("Pune", "MH", 177001))),
                new Employee(2, "Shyam", 60000,"Mangmt", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(3, "Ghanshyam", 80000, "Mangmt", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(4, "Rahul", 43567,"Ops", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(5, "Rohit", 45633,"Dev",
                        List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(6, "Ghanshyam", 45678, "HR", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(7, "Akshay", 87564,"Ops", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(8, "Sanjay", 23456,"Dev",
                        List.of(new Address("Gurugram", "HR", 741258),
                                new Address("Noida", "UP", 852147))),
                new Employee(9, "Neelu", 65478,"Ops", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(10, "Sita", 76567, "Ops", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(11, "Neha", 98076,"Mangmt", List.of(new Address("Hamirpur", "HP", 177001))),
                new Employee(12, "Pankaj", 104567,"Dev",
                        List.of(new Address("Hamirpur", "HP", 177001),
                                new Address("Bengaluru", "KA", 987456),
                                new Address("Hyderabad", "TS", 236547)))
        );


        System.out.println(salaryMap.values().stream()
                .max(Comparator.comparing(Integer::intValue))
                .orElse(0));

        System.out.println(salaryMap.entrySet().stream()
                .max(Map.Entry.comparingByValue()));

        Set<Integer> devAddress = employeeList.stream().filter(e -> e.getDept().equalsIgnoreCase("Dev"))
                .flatMap(a -> a.getAddress().stream())
                .map(Address::getPostalCode)
                .collect(Collectors.toSet());

        System.out.println(devAddress);
        System.out.println(salaryMap.entrySet().stream()
                .sorted(comparingByValue(Comparator.reverseOrder()))
                .skip(1)
                .findFirst());

        System.out.println(employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .skip(2)
                .findFirst());

        //Highest Salary By Dept
        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        maxBy(Comparator.comparing(Employee::getSalary))
                )));

        System.out.println("EMP LIST: "+employeeList.stream().collect(groupingBy(Employee::getDept, reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))))));
        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept
                )));

        System.out.println(employeeList.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDept,
                        Collectors.averagingDouble(Employee::getSalary)
                )));
        System.out.println(employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .average()
        );
        System.out.println(employeeList.stream()
                .mapToDouble(Employee::getSalary)
                .sum()
        );
















        /*System.out.println(employeeList.stream()
                        .filter(k-> Objects.equals(k.getDept(), "Dev"))
                        .flatMap(e->e.getAddress().stream()).map(Address::getCity)
                        .collect(Collectors.toSet()));

        employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).collect(Collectors.toList()));
        System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(3).findFirst().get());


        System.out.println("3rd Highest Salary : "+
                employeeList.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(2).findFirst().get());
        System.out.println("Lowest Salary : "+
                employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)).findFirst().get());
        *//*Integer fourth = salaryMap.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new)).stream().skip(3).findFirst().get();

        System.out.println(salaryMap);
        System.out.println(fourth);
        List<Integer> nth = salaryMap.values().stream()
                .filter(e -> e==fourth)
                .collect(Collectors.toList());

        //salaryMap.values().stream().sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(LinkedHashSet::new)).stream().skip(3).findFirst();
        salaryMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList()).get(3);

        System.out.println(salaryMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))).entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList()).get(3));*//*

        String str = "iampracticingjavastreamsapi";
        Map<String, Integer> budget = new HashMap<>();
        budget.put("clothes", 120); budget.put("grocery", 150);
        budget.put("transportation", 100);
        budget.put("utility", 130);
        budget.put("rent", 1150);
        budget.put("miscellneous", 90);
        IntStream strChars = str.chars();
        System.out.println(str.chars().mapToObj((c -> ((char) c))).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

        System.out.println(salaryMap.entrySet().stream().collect(Collectors.groupingBy(Map.Entry::getValue, Collectors.mapping(Map.Entry::getKey, Collectors.toList()))));

        System.out.println("map : "+salaryMap .entrySet() .stream() .sorted(comparingByValue(Comparator.reverseOrder())) .collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new)));
        System.out.println("IM-Dashboard-Safe".length());

        System.out.println("map before sorting: " + salaryMap);
        // let's sort this map by keys first
        Map<String, Integer> sorted = salaryMap .entrySet() .stream() .sorted(comparingByKey()) .collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("map after sorting by keys: " + sorted);
        // above code can be cleaned a bit by using method reference
        sorted = salaryMap .entrySet() .stream() .sorted(comparingByKey()) .collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        // now let's sort the map in decreasing order of keys
        sorted = salaryMap .entrySet() .stream() .sorted(Collections.reverseOrder(comparingByKey())) .collect( toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
        System.out.println("map after sorting by keys in descending order: " + sorted);

        //Highest Salary by Dept
        System.out.println("EMP LIST: "+employeeList.stream().collect(groupingBy(Employee::getDept, maxBy(Comparator.comparing(Employee::getSalary)))));
        System.out.println("EMP LIST: "+employeeList.stream().collect(groupingBy(Employee::getDept, reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary))))));*/
    }


}
