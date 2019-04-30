package ru.zolotarev.task4;

public class Fireman extends Person  {
    public String rank;
    private int salary;
    private static boolean alarmStatus = false;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public boolean isAlarmStatus() {
        return alarmStatus;
    }

    public void setAlarmStatus(boolean alarmStatus) {
        this.alarmStatus = alarmStatus;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary() {
        if (salary >12000 && salary <50000){
            this.salary = salary;
        } else {
            System.out.println("Incorrect salary!");
        }
    }


    public Fireman(int age, int growth, int weight, String sex, String name, String rank, String position, int salary) {
        super(age, growth, weight, sex, name);
        this.rank = rank;
        this.salary = salary;
        this.alarmStatus = alarmStatus;
    }

    @Override
    public String toString() {
        return "Fireman{\" +\n" +
                " \"age=\" + getAge() +\n" +
                " \", growth=\" + getGrowth() +\n" +
                " \", weight=\" + getWeight() +\n" +
                " \", sex='\" + getSex() + '\\'' +\n" +
                " \", name='\" + getName() + '\\'' +\n" +
                " \", rank='\" + getRank() + ''}";
    }

    public void training() {
        System.out.println("Training....");
    }
}

