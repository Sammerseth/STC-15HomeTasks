package ru.zolotarev.task6.ContractToAct;

import java.util.Scanner;

public class Contract {
    Scanner in = new Scanner(System.in);

    String contractShipper;
    String contractCustomer;
    String contractSupplyList;
    String contractDate;
    String contractCost;

    public String changeContractShipper() {
        System.out.println("Type shipper name: ");
        contractShipper = in.nextLine();
        return contractShipper;
    }

    public String changeContractCustomer() {
        System.out.println("Type customer name: ");
        contractCustomer = in.nextLine();
        return contractCustomer;
    }

    public String changeContractSupplyList() {
        System.out.println("Type list of supply: ");
        contractSupplyList = in.nextLine();
        return contractSupplyList;
    }

    public String changeContractDate() {
        System.out.println("Type contract date: ");
        contractDate = in.nextLine();
        return contractDate;
    }

    public String changeContractCost() {
        System.out.println("Type contract cost: ");
        contractCost = in.nextLine();
        return contractCost;
    }

    public void showContract() {
        System.out.println("Contract information:");
        System.out.println("Shipper:\n " + contractShipper + "\nCustomer:\n " + contractCustomer
                + "\nList of supply:\n " + contractSupplyList + "\nTotal cost of contract:\n " + contractCost + " $"
                + "\nDate:\n " + contractDate);
    }
}