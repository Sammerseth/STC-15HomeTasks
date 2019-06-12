package ru.zolotarev.task17;

import java.util.*;

public class PersonList {
    public static void main(String[] args) {
        List <Person> personList = new ArrayList<Person>();

        personList.add(new Person("Ivan", 29));
        personList.add(new Person("Anna", 35));
        personList.add(new Person("Anton", 32));
        personList.add(new Person("Elena", 31));


        System.out.println("before sort");
        for (Person person : personList){
            System.out.println(person.toString());
        }

        Collections.sort( personList, new SuperComparator());

        System.out.println("after sort");
        for (Person person : personList ){
            System.out.println(person.toString());
        }


    }
}
