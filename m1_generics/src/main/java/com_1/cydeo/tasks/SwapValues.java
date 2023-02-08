package com_1.cydeo.tasks;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SwapValues {
    public static void main(String[] args) {
        Integer[]a={1,2,3,4};
        swap(a,0,2);
        System.out.println(Arrays.toString(a));
    }
    private static<T> void swap(T[]a,int i,int c){
        T m=a[i];
        a[i]=a[c];
        a[c]=m;
    }


}
