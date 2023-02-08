package com.cydeo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<>(Arrays.asList(10,20,30,40));
       //Ascending
        Collections.sort(list);
        System.out.println(list);

//Descending
        Collections.sort(list,new MyComparator());
        System.out.println(list);

         //Lamda
        Collections.sort(list,((o1,o2)->(o1>o2)?-1:(o1<o2)?1:0));
//Ascending order
        list.sort((o1,o2)->o1.compareTo(o2));
        System.out.println(list);
        //Descending order
        list.sort((o2,o1)->o1.compareTo(o2));
        System.out.println(list);

    }
}
