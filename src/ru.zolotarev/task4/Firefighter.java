package ru.zolotarev.task4;

public class Firefighter extends Fireman {
    private boolean equipmentStatus;

    public static int crewCounter = 0;
    public static int readyCrewMembers = 0;

    Firefighter[] Crew ;

    public Firefighter(int age, int growth, int weight, String sex, String name, String rank, String position, int salary) {
        super(age, growth, weight, sex, name, rank, position, salary);
        crewCounter++;
    }

    public boolean isEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(boolean equipmentStatus) {
        this.equipmentStatus = equipmentStatus;
    }

     public int sitInCar() {
         if (isAlarmStatus() == true) {
             System.out.println(" Going to equip! " +
                     " Taking place in vehicle! ");
             System.out.println(rank + name + " ready! ");
             setEquipmentStatus(true);
             readyCrewMembers++;
             return readyCrewMembers;
         } else {
             eating();
             sleeping();
             training();
             readyCrewMembers = 0;
             return readyCrewMembers;
         }
     }
    @Override
    public String toString() {
        return "Firefighter{" +
                "rank='" + rank + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}