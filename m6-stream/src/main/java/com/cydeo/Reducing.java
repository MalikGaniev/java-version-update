package com.cydeo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducing {
    public static void main(String[] args) {
        List<Integer>numbers= Arrays.asList(4,5,3,9);
        int result=numbers.stream().reduce(0,(a,b)->a+b);
        System.out.println(result);
        System.out.println("Dish Calories Total");
        int totalCalor=DishData.getAll().stream()
                .map(i->i.getCalories())
             .reduce(0,(a,b)->a+b);
                      //  .reduce(Integer::sum);
        System.out.println(totalCalor);

        //Max and Min
        Optional<Integer>min=numbers.stream().reduce(Integer::min);
        Optional<Integer>max=numbers.stream().reduce(Integer::max);
        Optional<Integer>sum=numbers.stream().reduce(Integer::sum);

        System.out.println("Min: "+min.get());
        System.out.println("Max: "+max.get());
        System.out.println("Sum: "+sum.get());

        System.out.println("Count");
        long dishCount=DishData.getAll().stream().count();
        System.out.println(dishCount);
    }
}
