package ru.zolotarev.task4;

public class Person {
    private int age;
    private int growth;
    private int weight;
    private String sex;
    public  String name;

    public Person(int age, int growth, int weight, String sex, String name) {
        this.age = age;
        this.growth = growth;
        this.weight = weight;
        this.sex = sex;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age>18 && age <45){
            this.age = age;
        } else{
            System.out.println("Incorrect age!");
        }

    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        if (growth<200 && growth >150) {
        this.growth = growth;
        } else {
            System.out.println("Incorrect growth!");
        }
    }


    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight < 100 && weight > 60) {
            this.weight = weight;
        } else {
            System.out.println("Incorrect weight!");
        }
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + getAge() +
                ", growth=" + getGrowth() +
                ", weight=" + getWeight() +
                ", sex='" + getSex() + '\'' +
                ", name='" + getName() + '\'' +
                '}';
    }

    public static void eating() {
        System.out.println("Eating...");
    }
    public static void sleeping(){
        System.out.println("Sleeping..zzz..zz..");
    }
    public void sayAge(){
        System.out.println("I am " + getAge() + " years old.");
    }
}
