package com.training.platinum;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NewTestTwo {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        Person person = new Person();
        person.setId(1);
        person.setName("Subra");
        person.setAge("38");

        Person personOne = new Person();
        personOne.setId(2);
        personOne.setName("Hari");
        personOne.setAge("23");

        Person personTwo = new Person();
        personTwo.setId(3);
        personTwo.setName("Sai");
        personTwo.setAge("23");

        personList.add(personOne);
        personList.add(personTwo);
        personList.add(person);

       List<String> listOne = personList.stream()
               .map( person1 -> person1.getName())
               .collect(Collectors.toList());


        System.out.println(listOne);
    }
}
