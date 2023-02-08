package com.cydeo;

import java.util.Arrays;
import java.util.List;

public class EmployeTest {
    public static void main(String[] args) {
      //Print emails
        EmployeeData.readAll()
                //.map(Employee::getEmpEmail)
                .map(Employee::getEmpEmail)
                .forEach(System.out::println);
        System.out.println("Print all phoe numbers");
        EmployeeData.readAll()
                .flatMap(employee -> employee.getEmpPhoneNumbers().stream())
                .forEach(System.out::println);
        System.out.println("Print all phone numbers with double colon" );
        EmployeeData.readAll()
                .map(Employee::getEmpPhoneNumbers)
                .flatMap(List::stream)
                .forEach(System.out::println);
    }
}
