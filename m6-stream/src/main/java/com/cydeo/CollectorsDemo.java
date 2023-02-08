package com.cydeo;

import java.util.*;
import java.util.stream.Collectors;

public class CollectorsDemo {
    public static void main(String[] args) {
        List<Integer>num= Arrays.asList(3,4,5,6,6,7);
        //toCollection(Supplier):is used to create a Collection using Collectors
       List<Integer> numberList=num.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(numberList);
        Set<Integer>numberSet=num.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toCollection(HashSet::new));
        System.out.println(numberSet);
    //toList(): returns a Collector inteface that gethers the input data into a new list
      List<Integer>numberList2=  num.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toList());
//ToSet():return a Collector interface that gathers the inpur data into a new set
        Set<Integer>numbersSet2=num.stream()
                .filter(x->x%2==0)
                .collect(Collectors.toSet());
        //toMap(Function,Function):returns a Collectors interface that gathers the input data into new map
        Map<String,Integer>dishMap=DishData.getAll().stream()
                .collect(Collectors.toMap(Dish::getName,Dish::getCalories));
        System.out.println(dishMap);

        //summingInt(ToIntFunction):returns a Collector that produces the sum of a integer valued function
        Integer sum=DishData.getAll().stream()
                .collect(Collectors.summingInt(Dish::getCalories));
        System.out.println(sum);
//coubnting():returns a Collectors that cunts the number of the Elements
        Long evenCount=num.stream()
                .filter(x->x%2==0)
                .collect(Collectors.counting());
        System.out.println(evenCount);
   //averageInt(ToIntFunction):returns the average of the integeer passed values
        Double b=DishData.getAll().stream()
                .collect(Collectors.averagingInt(Dish::getCalories));
        System.out.println(b);
        //joining():is used to join various elemtn of a character or string array into a single object
        List<String>courses=Arrays.asList("Java","JS","TS");
      String str=  courses.stream()
                .collect(Collectors.joining(","));
        System.out.println(str);
//partitioningBy():is used to partition a stream of object (or a set of element(based on a given predicate))
      Map<Boolean,List<Dish>>dishMap1=  DishData.getAll().stream().
                collect(Collectors.partitioningBy(Dish::isVegetarian));
        System.out.println(dishMap1);
//groupingBy(); is used for grouping objects by some property and storing result in a map instance
        Map<Type,List<Dish>>dishType=DishData.getAll().stream()
                .collect(Collectors.groupingBy(Dish::getType));
        System.out.println(dishType);



    }
}
