package com_3.cydeo.Task2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@Setter
public class Person {
    private String name;
    private int age;
    private Gender gender;

}
