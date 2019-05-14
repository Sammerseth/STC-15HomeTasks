package ru.zolotarev.task7;

public class Duck extends Animal implements Fly,Run,Swim{

    public Duck(String name) {
        super(name);
    }
    @Override
    public void getName() {
        System.out.println(name);
    }
    @Override
    public void running(){
        System.out.println("Running...");
    }
    @Override
    public void runningFast() {}
    @Override
    public void flying(){
        System.out.println("Flying...");
    }
    @Override
    public void flyingFast() {}
    @Override
    public void swimming(){
        System.out.println("Swimming...");
    }
    @Override
    public void swimmingFast() {}

}
