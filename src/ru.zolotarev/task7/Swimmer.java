package ru.zolotarev.task7;

public class Swimmer extends Person{

    @Override
    public void running(){
        System.out.println("Running...");
    }
    @Override
    public void runningFast() {
        System.out.println("Running(Not so fast as runner, but still fast)...");
    }
    @Override
    public void swimming() {
        System.out.println("Swimming...");
    }
    @Override
    public void swimmingFast() {
        System.out.println("Fastest swimmer in the pool!");
    }
}
