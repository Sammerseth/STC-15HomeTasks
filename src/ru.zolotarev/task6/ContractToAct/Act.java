package ru.zolotarev.task6.ContractToAct;

public class Act {
    String actShipper;
    String actCustomer;
    String actSupplyList;
    String actDate;
    String actCost;

    public void showAct() {
        System.out.println("\nShipper:\n " + actShipper + "\nCustomer:\n " +
                actCustomer + "\nList of supply:\n " + actSupplyList +
                "\nTotal cost:\n " + actCost + " $" + "\nDate:\n " + actDate);
    }
}
