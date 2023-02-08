package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DishTask {
    public static void main(String[] args) {




        //Print all dish name that hav less than 400 calories
DishData.getAll().stream().filter(i->i.getCalories()<400)
        .map(i->i.getName())
        .forEach(System.out::println);
        System.out.println("----------------------------------");
        //Print the lengh of the name of each dish
DishData.getAll().stream()
        //.map(i->i.getName().length())
        .map(Dish::getName)
        .map(String::length)
        .forEach(System.out::println);
        System.out.println("------------------------");
        //Print three high caloric dish name
DishData.getAll().stream()
        .filter(i->i.getCalories()>400)
       .map(Dish::getName)
        .forEach(System.out::println);
        System.out.println("----------------------------");
        //Print all dish name that are below 400 calories in sorted
DishData.getAll().stream()
        .filter(i->i.getCalories()<400)
        .sorted(Comparator.comparing(dish -> dish.getCalories()))
        .map(i->i.getName())
        .forEach(System.out::println);
    }
}
