package ru.zolotarev.task4;

public class SquadLeader extends Fireman {
    private boolean equipmentStatus;

    public boolean isEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(boolean equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

    public SquadLeader(int age, int growth, int weight, String sex, String name, String rank, String position, int salary) {
        super(age, growth, weight, sex, name, rank, position, salary);
    }

    public void finalCheck(int crewCounter, int readyCrewMembers) {
        if (isAlarmStatus() == true && crewCounter == readyCrewMembers) {
            setEquipmentStatus(true);
            System.out.println(" Address checked.");
            System.out.println(" Crew ready.");
            System.out.println(" Moving to objective!");
            readyCrewMembers++;

        } else {
            sleeping();
            eating();
            training();
        }
    }
}
