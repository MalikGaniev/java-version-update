package com_3.cydeo.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Car {
    private String make;
    private int topSpeed;
    private int year;
}
