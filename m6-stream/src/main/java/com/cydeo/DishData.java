package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class DishData {
    public static List<Dish>getAll(){
return Arrays.asList(
        new Dish("pork",false,200,Type.MEAT),
        new Dish("beef",false,300,Type.MEAT),
        new Dish("chicken",true,550,Type.OTHER),
        new Dish("fries",true,500,Type.OTHER),
        new Dish("pizza",false,600,Type.OTHER),
        new Dish("prawns",true,400,Type.FISH)

);
    }
}
