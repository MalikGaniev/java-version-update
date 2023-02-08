package com_3.cydeo.review;

public class CarFastPredicate implements CarPredicate{
    @Override
    public boolean test(Car car) {
        return car.getTopSpeed()>160;
    }
}
