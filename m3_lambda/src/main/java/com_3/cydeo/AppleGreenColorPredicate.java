package com_3.cydeo;

public class AppleGreenColorPredicate implements ApplyPredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getColor().equals(Color.GREEN);
    }
}
