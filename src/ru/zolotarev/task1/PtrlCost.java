package ru.zolotarev.task1;

public class PtrlCost {
    public static void main(String[] args){
        int cost92 = 41;
        int cost95 = 45;
        int costDF = 46;
        int necessaryAmount = 10;

        System.out.println(necessaryAmount + " liters of 92 is cost " + (cost92*necessaryAmount));
        System.out.println(necessaryAmount + " liters of 95 is cost " + (cost95*necessaryAmount));
        System.out.println(necessaryAmount + " liters of DF is cost " + (costDF*necessaryAmount));
    }
}