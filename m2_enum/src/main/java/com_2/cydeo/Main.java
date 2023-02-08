package com_2.cydeo;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("How to access a constant");
        Currency c=Currency.DIME;
        System.out.println(c);
        System.out.println(Currency.PENNY);
        System.out.println("How to get all constance");
        Currency [] currencies=Currency.values();
        System.out.println(Arrays.toString(currencies));
        for (Currency currency : currencies) {
            System.out.println(currency);
        }
switch(Currency.DIME){
    case PENNY:
        System.out.println("it is 1 cent");
        break;
    case NICKLE:
        System.out.println("It is 5 cent");
        break;
    case DIME:
        System.out.println("It is 10 cent");
        break;
    case QUARTER:
        System.out.println("It is 25 cent");
        break;

}

        System.out.println("Operation Task");
calculate(3,5,Operator.MINUS);
        System.out.println("How to retrive the constant value "+Currency.PENNY.getValue());
        System.out.println(Currency.QUARTER.getValue());
        System.out.println(Currency.QUARTER.ordinal());
        System.out.println(Currency.PENNY.ordinal());
    }
    private static void calculate(double x,double y,Operator operation){

        switch (operation){
            case PLUS:
                System.out.println(x+y);
                break;
            case MINUS:
                System.out.println(x-y);
                break;
            case MULTIPLY:
                System.out.println(x*y);
                break;
            case DIVIDED:
                System.out.println(x/y);
                break;
        }
    }
}
