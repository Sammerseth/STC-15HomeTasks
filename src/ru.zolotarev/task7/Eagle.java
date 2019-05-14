package ru.zolotarev.task7;

public class Eagle extends Animal implements Fly,Run{

    public Eagle(String name) {
        super(name);
    }
    @Override
    public void getName() {
        System.out.println(name);
    }
    @Override
    public void flying(){
        System.out.println("Flying...");
    }
    @Override
    public void flyingFast(){}
    @Override
    public void running(){}
    @Override
    public void runningFast() {}
}
