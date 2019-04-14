package ru.zolotarev.task1;

public class AfterTaxSalery1 {
    public static void main(String[] args){
        double tax = 0.13;
        int salaryIncom = 35000;
        System.out.println("Your salary is " + (salaryIncom - (salaryIncom * tax)));
    }
}
