package ru.zolotarev.task7;

public class Cat extends Animal implements Run,Swim{

    public Cat(String name) {
        super(name);
    }
    @Override
    public void getName() {
        System.out.println(name);
    }

    @Override
    public void running() {
        System.out.println("Running...");
    }
    @Override
    public void runningFast(){}
    @Override
    public void swimming(){
        System.out.println("Swimming...");
    }
    @Override
    public void swimmingFast() {}
}
