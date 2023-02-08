package com.cydeo.java10;

import java.util.Arrays;

public class LocalVariableTypeDemo {
    public static void main(String[] args) {
       String s;
       s="Ozzy";

        var str="Cydeo";
        var number=5;
        byte x=1;
        var y=1;
        var price=12.50;
        var numbers= Arrays.asList(1,2,3);
        var sum=0;
        for (var eachNumber:numbers){
            sum=sum+eachNumber;
        }
    }
}
