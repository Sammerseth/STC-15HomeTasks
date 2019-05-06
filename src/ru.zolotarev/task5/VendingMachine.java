package ru.zolotarev.task5;

import java.util.Scanner;

public class VendingMachine {
    Scanner in = new Scanner(System.in);
    int moneyAmount;

    public VendingMachine(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public enum Drinks {
        WATER(20, "Bon Aqua"),
        TEA(50, "Lipton"),
        COLA(60, "Coca-cola"),
        PEPSI(60, "Pepsi"),
        BEER(90, "Tuborg"),
        WHISKEY(200, "Jack Daniels"),
        VODKA(150, "Smirnoff");

        int cost;
        String title;

        Drinks(int cost, String title) {
            this.cost = cost;
            this.title = title;
        }
    }

    public void showAndCheck() {
        System.out.println("Welcome to vending machine! Type 'show' for available drinks, " +
                "or 'check' for checking money");
        String usrChoice = in.next();

        switch (usrChoice) {
            case "show":
                for (Drinks drinks : Drinks.values())
                    System.out.println(drinks + " , " + drinks.title + " , " + drinks.cost);
                break;

            case "check":
                System.out.println("You have " + moneyAmount);
                break;

            default:
                System.out.println("Incorrect input");
        }
    }

    public int addMoney() {
        int a;

        System.out.println("Insert money ");
        a = in.nextInt();
        if (a>0){
            moneyAmount = moneyAmount + a;
        } else {
            System.out.println("Incorrect amount!");
        }

        System.out.println("Type 'check' for checking your money or any other key for choosing drink");
        String usrChoice2 = in.next();
        if (usrChoice2.equalsIgnoreCase("check")) {
            System.out.println(moneyAmount);
            return moneyAmount;
        } else {
            return moneyAmount;
        }

    }

    public int chooseDrink() {
        System.out.println("Type a name of drink: ");
        String usrChoice3 = in.next();
        switch (usrChoice3) {
            case "water":
                if (moneyAmount >= Drinks.WATER.cost) {
                    moneyAmount = moneyAmount - Drinks.WATER.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }
            case "tea":
                if (moneyAmount >= Drinks.TEA.cost) {
                    moneyAmount = moneyAmount - Drinks.TEA.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }
            case "cola":
                if (moneyAmount >= Drinks.COLA.cost) {
                    moneyAmount = moneyAmount - Drinks.COLA.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }
            case "pepsi":
                if (moneyAmount >= Drinks.PEPSI.cost) {
                    moneyAmount = moneyAmount - Drinks.PEPSI.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }

            case "beer":
                if (moneyAmount >= Drinks.BEER.cost) {
                    moneyAmount = moneyAmount - Drinks.BEER.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }

            case "whiskey":
                if (moneyAmount >= Drinks.WHISKEY.cost) {
                    moneyAmount = moneyAmount - Drinks.WHISKEY.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }

            case "vodka":
                if (moneyAmount >= Drinks.VODKA.cost) {
                    moneyAmount = moneyAmount - Drinks.VODKA.cost;
                    System.out.println("Take your drink! You have " + moneyAmount
                            + " on your account");
                    break;
                } else {
                    System.out.println("You dont have enough money. Add more!");
                    break;
                }

            default:
                System.out.println("Incorrect input");

        }
        return moneyAmount;
    }
}

