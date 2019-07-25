package ru.zolotarev.task10;

import java.util.Scanner;

public class VendingMachine {
    int moneyAmount = 0;
    Scanner in = new Scanner(System.in);

    public void showMenu() {
        System.out.println("Welcome to vending machine");
        System.out.println("Next commands are allowed: 'add money', 'choose', 'balance', 'show'");

    }


    public void showDrinks() {
        System.out.println("Next drinks are allowed: ");
        System.out.println(Drinks.TEA.title + "----" + Drinks.TEA.cost);
        System.out.println(Drinks.COFFEE.title + "----" + Drinks.COFFEE.cost);
        System.out.println(Drinks.WATER.title + "----" + Drinks.WATER.cost);
    }


    public int addMoney(int moneyAmount) throws MoneyJamException {
        System.out.println("print amount of money you want to add: ");
        int moneyToAdd = in.nextInt();
        if (Math.random() < 0.2) {
            throw new MoneyJamException();
        }
        moneyAmount += moneyToAdd;
        return moneyAmount;
    }

    public void chooseDrink() throws NotEnoughMoneyException, InvalidCommandException {
        String usrChoice = in.next();

        if (usrChoice.equalsIgnoreCase(Drinks.WATER.title)){
            if (moneyAmount >= Drinks.WATER.cost) {
                moneyAmount -= Drinks.WATER.cost;
            } else {
                    throw new NotEnoughMoneyException();
                }
            }

        if (usrChoice.equalsIgnoreCase(Drinks.TEA.title)){
            if (moneyAmount >= Drinks.TEA.cost){
                moneyAmount-=Drinks.TEA.cost;
            } else {
                throw new NotEnoughMoneyException();
            }
        }

        if (usrChoice.equalsIgnoreCase(Drinks.COFFEE.title)){
            if (moneyAmount >= Drinks.COFFEE.cost){
                moneyAmount-=Drinks.COFFEE.cost;
            } else {
                throw new NotEnoughMoneyException();
            }
        } else {
            throw new InvalidCommandException();
        }

        System.out.println("Get your drink!");

    }

    public void showBalance(){
        System.out.println(moneyAmount);
    }


}
