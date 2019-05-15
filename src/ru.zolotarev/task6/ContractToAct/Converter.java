package ru.zolotarev.task6.ContractToAct;

public class Converter {
    public static void main(String[] args) {

        Contract FirstContract = new Contract();

        FirstContract.changeContractShipper();
        FirstContract.changeContractCustomer();
        FirstContract.changeContractSupplyList();
        FirstContract.changeContractCost();
        FirstContract.changeContractDate();
        FirstContract.showContract();

        Act FirstAct = new Act();

        FirstAct.actShipper = FirstContract.contractShipper;
        FirstAct.actCustomer = FirstContract.contractCustomer;
        FirstAct.actSupplyList = FirstContract.contractSupplyList;
        FirstAct.actDate = FirstContract.contractDate;
        FirstAct.actCost = FirstContract.contractCost;

        System.out.println("\nNew act ready!");

        FirstAct.showAct();
    }
}