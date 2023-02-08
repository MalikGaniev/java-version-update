package com.cydeo.java9;

import java.util.*;

public class FactoryMethodDemo {
    public static void main(String[] args) {
        //Creating unmodifiable List before java9
        List<String >courses= Collections.unmodifiableList(Arrays.asList("Java","Spring","Agile"));
        courses.add("TS");
        System.out.println(courses);
        //Creating unmodifiable List after java9
        List<String>myCourses=List.of("Java","Spring","Agile");
        //Creating unmodifiable Set after java9
        Set<String>myProduct=Set.of("Milk","Bread","Butter");
        //creating unmodifiable Map after java9
        Map<String,Integer>myCart=Map.ofEntries(
                Map.entry("Samsung TV",1),
                Map.entry("PSP",1),
                Map.entry("Char",5)
        );
    }
}
