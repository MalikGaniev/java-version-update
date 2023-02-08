package com_3.cydeo.Task;

import com_3.cydeo.Color;

import java.util.ArrayList;
import java.util.List;

public class OrangeTest {
    public static void main(String[] args) {
        List<Orange> inventory=new ArrayList<>();
        inventory.add(new Orange(300, Color.GREEN));
        inventory.add(new Orange(100,Color.RED));
        inventory.add(new Orange(200,Color.GREEN));
        inventory.add(new Orange(50,Color.RED));

        OrangeFormatter orangeLambda=orange ->"An orange of "+orange.getWeight()+"g";
        prettyPrintApple(inventory,orangeLambda);

        prettyPrintApple(inventory,orange ->"An orange of "+orange.getWeight()+"g");
        OrangeFormatter fancyFormatter=orange -> {
            String ch=orange.getWeight()>200?"Heavy":"Light";
            return "A"+ch+" "+orange.getColor()+" orange";
        };
    }
    private static void prettyPrintApple(List<Orange>inventory,OrangeFormatter r){
        for(Orange orange: inventory){
            String output=r.accept(orange);
            System.out.println(output);
        }
    }
}
