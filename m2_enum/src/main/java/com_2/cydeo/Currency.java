package com_2.cydeo;

public enum Currency {
    PENNY(1),NICKLE(2),DIME(3),QUARTER(4);
    private int value;

    Currency(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
