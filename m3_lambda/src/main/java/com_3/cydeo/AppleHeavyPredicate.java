package com_3.cydeo;

public class AppleHeavyPredicate implements ApplyPredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }
}
