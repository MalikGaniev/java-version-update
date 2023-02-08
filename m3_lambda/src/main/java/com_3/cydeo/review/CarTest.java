package com_3.cydeo.review;

import java.util.ArrayList;
import java.util.List;

public class CarTest {
    public static void main(String[] args) {
        List<Car>carList=new ArrayList<>();
        carList.add(new Car("Toyota",140,1998));
        carList.add(new Car("Audi",200,2008));
        carList.add(new Car("BMW",210,2020));
        carList.add(new Car("Nissan",150,2018));

        System.out.println("Fast Cars:");
        System.out.println(filter(carList,new CarFastPredicate()));
        System.out.println("New Cars:");
        System.out.println(filter(carList,new CarNewPredicate()));

        CarPredicate newCarPredicate=car->  car.getYear()>2015;
        System.out.println("New Cars:");
        System.out.println(filter(carList,newCarPredicate));;
        System.out.println("Fast Cars:");
        System.out.println(filter(carList,car->car.getTopSpeed()>160));

    }
 //   private static List<Car>filterFastCars(List<Car>cars){
   //     List<Car>filterCars=new ArrayList<>();
     //   for (Car car:cars){
       //     if(car.getTopSpeed()>168){
         //       filterCars.add(car);
           // }
        //}
        //return filterCars;
    //}

    //private static List<Car>filterNewCars(List<Car>cars){
      //  List<Car>filterCars=new ArrayList<>();
        //for (Car car:cars){
          //  if(car.getYear()>2015){
            //    filterCars.add(car);
            //}
        //}
        //return filterCars;


//}
private static List<Car>filter(List<Car>cars,CarPredicate carFastPredicate){
     List<Car>filterCars=new ArrayList<>();
     for (Car car:cars){
         if(carFastPredicate.test(car)){
             filterCars.add(car);
         }
     }
return filterCars;
    }
}
