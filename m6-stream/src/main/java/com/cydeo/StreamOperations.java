package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamOperations {
    public static void main(String[] args) {
        List<Integer>list= Arrays.asList(1,2,3,2,4);
    //    list.forEach(System.out::println);


        //Filter
        list.stream()
                .filter(i->i%2==0)
                .forEach(System.out::println);
        //Distinct
Stream< Integer >stream=list.stream()
        .filter(i->i%2==0)
        .distinct();
stream.forEach(System.out::println);
        System.out.println("Limit");
list.stream()
        .filter(i->i%2==0)
        .limit(1)
        .forEach(System.out::println);

        System.out.println("Skip");
        list.stream()
                .filter(i->i%2==0)
                .skip(1)
                .forEach(System.out::println);
        System.out.println("Map");
        list.stream()
                .map(number->number*2)
                .filter(i->i%3==0)
                .forEach(System.out::println);
        System.out.println("----------------------------------");
        ArrayList<String> m=new ArrayList<>(Arrays.asList("Java","Apple","Honda","Developer"));
       m.stream()
               .map(i->i.length())
               .forEach(System.out::println);

    }
}
