package com.cydeo;

import java.util.Arrays;
import java.util.stream.Stream;

public class EmployeeData {
    public static Stream<Employee>readAll(){
        return Stream.of(
                new Employee(100,"Mike","mike@cydeo.com", Arrays.asList("2022028765","70387783452")),
        new Employee(101,"Ozzy","mike@cydeo.com", Arrays.asList("2022028765","70387783452")),
        new Employee(102,"Peter","mike@cydeo.com", Arrays.asList("2022028765","70387783452")),
        new Employee(102,"Peter","peter@cydeo.com",Arrays.asList("5126456464634","54566734455"))


        );
    }
}
