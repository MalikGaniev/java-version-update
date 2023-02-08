package com_1.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class GenericsTest {
    public static void main(String[] args) {
        List<Student> studentList=new ArrayList<>();
        studentList.add(new Student("Mike",101));
        studentList.add(new Student("Joe",102));
        studentList.add(new Student("Adam",103));
        List<Teacher>teachersList=new ArrayList<>();
        teachersList.add(new Teacher("Albus",201));
        teachersList.add(new Teacher("Severus",202));
//student(studentList);
     //   System.out.println(takesList(studentList));
      //  System.out.println(takesList(teachersList));
      MyUtils<Student>obj1=new MyUtils<>();
obj1.printInfo(studentList);
        System.out.println(obj1.takesList(studentList));
  MyUtils<Teacher>obj2=new MyUtils<>();
  obj2.printInfo(teachersList);
        System.out.println(obj2.takesList(teachersList));
    }
    //Write a method that takes a list of student and print each student
    //and the total student count.
    public static void student(List<Student>s) {

        for (Student t : s) {

            System.out.println(t);

        }
        System.out.println(s.size());
    }
   // public static <T>void printInfo(List<T>s){
   //     for (T t : s) {

    //        System.out.println(t);

     //   }
     //   System.out.println(s.size());
  //  }
    //Write a method that takes a list and retirn the las item of the list.
  //  public static <T> T takesList(List<T>list){
  //    return list.get(list.size()-1);
  //  }



}
