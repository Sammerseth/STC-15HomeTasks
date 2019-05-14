package ru.zolotarev.task7;

public class Runner extends Person {
    @Override
    public void running(){
        System.out.println("Running...");
    }
    @Override
    public void runningFast(){
        System.out.println("Faster runner on the street!");
    }
    @Override
    public void swimming(){
        System.out.println("Swimming...");
    }
    @Override
    public void swimmingFast(){
        System.out.println("Swimming(Fast, but not so fast as swimmer)...");
    }
}
