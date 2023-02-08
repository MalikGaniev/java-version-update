package com_1.cydeo.review;

import java.util.List;

public class MyUtils<T extends Person> {
    public  void printInfo(List<T> s){
        for (T t : s) {

            System.out.println(t);

        }
        System.out.println(s.size());
    }
    //Write a method that takes a list and retirn the las item of the list.
    public  T  takesList(List<T>list){
        return list.get(list.size()-1);
    }
}
