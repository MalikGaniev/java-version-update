package com_1.cydeo.review;

import lombok.*;

@AllArgsConstructor
//@NoArgsConstructor
//@RequiredArgsConstructor//We use to assign final value
@Getter
@Setter
public class Student extends Person{
    private String name;
    private  final int id;

    public Student(int age, String name, int id) {
        this.name = name;
        this.id = id;
    }
}
