package com.cydeo.java12;

import java.util.*;
import java.util.stream.Collectors;

public class TeeingDemo {

    public static void main(String[] args) {
        List<Employee>employees= Arrays.asList(
                new Employee(1,"A",100),
                new Employee(2,"B",200),
                new Employee(3,"C",300),
                new Employee(4,"D",400)
        );
      HashMap<String,Employee>e=  employees.stream()
                .collect(Collectors.teeing(
                        Collectors.maxBy(Comparator.comparing(Employee::getSalary)),
                        Collectors.minBy(Comparator.comparing(Employee::getSalary)),
                        (e1,e2)->{
                            HashMap<String,Employee>map=new HashMap<>();
                            map.put("Max", e1.get());
                            map.put("MIN",e2.get());
                            return map;
                        }
                ));
        System.out.println(e);
    }


}
