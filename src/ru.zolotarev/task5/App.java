package ru.zolotarev.task5;

public class App {
    public static void main(String[] args) {
        VendingMachine vm1 = new VendingMachine(0);
        for (; ; ) {
            vm1.showAndCheck();
            vm1.addMoney();
            vm1.chooseDrink();

        }
    }
}