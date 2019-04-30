package ru.zolotarev.task4;

public class VehicleDriver extends Fireman  {
    public VehicleDriver(int age, int growth, int weight, String sex, String name, String rank, String position, int salary) {
        super(age, growth, weight, sex, name, rank, position, salary);
    }

    public void engineStart() {
        if (isAlarmStatus() == true) {
            System.out.println(" Starting vehicle engine");
        } else {
            sleeping();
            eating();
        }
    }
}
