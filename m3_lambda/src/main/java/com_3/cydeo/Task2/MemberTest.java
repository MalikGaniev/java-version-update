package com_3.cydeo.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MemberTest {
    public static void main(String[] args) {
        Person p1=new Person("mike",35,Gender.MALE);
        Person p2=new Person("Malik",20,Gender.MALE);
        Person p3=new Person("Ozzy",35,Gender.MALE);
        Person p4=new Person("Asya",24,Gender.FEMALE);
List<Person>personList= Arrays.asList(p1,p2,p3,p4);

CheckMember checkMember=p->p.getGender()==Gender.MALE&&p.getAge()>=18&&p.getAge()<=25;
CheckMember(personList,checkMember);

    }
    private static void CheckMember(List<Person>personList,CheckMember checkMember){
        List<Person>result=new ArrayList<>();
        for (Person person:personList){
            if(checkMember.Check(person)){
                result.add(person);
            }
        }
    }
}
