package com_3.cydeo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {


    List<Apple>inventory=new ArrayList<Apple>();
inventory.add(new Apple(300,Color.GREEN));
        inventory.add(new Apple(100,Color.RED));
        inventory.add(new Apple(200,Color.GREEN));
        inventory.add(new Apple(50,Color.RED));
  List<Apple>heavyApple=filterApples(inventory,new AppleHeavyPredicate());
        System.out.println(heavyApple);
  List<Apple>greenApple=filterApples(inventory,new AppleGreenColorPredicate());
        System.out.println(greenApple);

        ApplyPredicate weighApple=apple->apple.getWeight()>200;
        System.out.println(filterApples(inventory, weighApple));


    }
    private static List<Apple>filterApples(List<Apple>inventory,ApplyPredicate applyPredicate){

        List<Apple>result=new ArrayList<>();
        for (Apple apple:inventory){
            if(applyPredicate.test(apple)){
                result.add(apple);
            }
        }
        return result;
    }
}
