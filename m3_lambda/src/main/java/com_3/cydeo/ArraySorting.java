package com_3.cydeo;

public class ArraySorting {//QuickSort,BubbleSort

    public static void main(String[] args) {
        ArraySorting as=new ArraySorting();
        QuickSort quickSort=new QuickSort();
        BubbleSort bubbleSort=new BubbleSort();
        as.sort(quickSort);
        as.sort(bubbleSort);
    }
    private void sort(Sorting sorting){
        sorting.sort();
    }
}
