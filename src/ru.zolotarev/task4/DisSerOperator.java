package ru.zolotarev.task4;

public class DisSerOperator extends Fireman {

    public DisSerOperator(int age, int growth, int weight, String sex, String name, String rank, String position, int salary) {
        super(age, growth, weight, sex, name, rank, position, salary);
    }



    public void getAddress(boolean calling) {
        if (calling == true) {
            System.out.println("\n" +
                    " First move on departure!");
            setAlarmStatus(true);
        } else {
            eating();
            sleeping();
        }
    }
}

