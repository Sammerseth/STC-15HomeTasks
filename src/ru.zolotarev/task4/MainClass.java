package ru.zolotarev.task4;

public class MainClass {
    public static void main(String[] args) {
        boolean calling;
        double x = Math.random();
        if (x >= 0.5) {
            calling = true;
        } else {
            calling = false;
        }

        DisSerOperator dso1 = new DisSerOperator(28,164,52,"female","Ivanova", "private ",
                "dispath service operator", 29000);
        VehicleDriver vd1 = new VehicleDriver(50,174,90,"male","Petrov","volunteer ",
                "vehicle driver",12000);
        SquadLeader sl1 = new SquadLeader(30,180,85,"male","Sidorov","captain ",
                "squad leader", 42000);
        Firefighter n1 = new Firefighter(26,179,77,"male","Kuznetsov", "sergeant ",
                "squad leader's assistant", 35000);
        Firefighter n2 = new Firefighter(24,175,70,"male","Popov","private ",
                "firefighter", 30000);
        Firefighter n3 = new Firefighter(25, 178,70,"male","Sokolov","private ",
                "firefighter", 32000);
        Firefighter n4 = new Firefighter(22,182,75,"male","Novikov","private ",
                "firefighter",29000);



        dso1.getAddress(calling);
        vd1.engineStart();
        n1.sitInCar();
        n2.sitInCar();
        n3.sitInCar();
        n4.sitInCar();
        sl1.finalCheck();
    }
}
