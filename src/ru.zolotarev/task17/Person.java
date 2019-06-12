package ru.zolotarev.task17;

import java.util.Comparator;

public class Person implements Comparable <Person> {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int compareTo(Person o) {
        if (name.compareTo(o.getName()) == 0) {
            return age.compareTo(o.getAge());
        } else {
            return name.compareTo(o.getName());
        }
    }
}
