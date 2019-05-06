package ru.zolotarev.task6;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (; ; ) {

            System.out.println("Type 'add' for addition, 'sub' for subtraction," +
                    "'mult' for multiplication, 'div' for division and 'per' for taking percent: ");

            String usrChoice = in.next();

            switch (usrChoice) {
                case "add":
                    addition();
                    break;
                case "sub":
                    subtraction();
                    break;
                case "mult":
                    multiplication();
                    break;
                case "div":
                    division();
                    break;
                case "per":
                    takingPercent();
                    break;
                default:
                    System.out.println("Incorrect input. Try again!");
                    break;
            }
        }
    }
    public static void addition() {
        Scanner scn1 = new Scanner(System.in);
        System.out.println("Type two numbers: ");
        double a = scn1.nextDouble();
        double b = scn1.nextDouble();
        System.out.println(a+b);
    }
    public static void subtraction(){
        Scanner scn2 = new Scanner(System.in);
        System.out.println("Type two numbers: ");
        double c = scn2.nextDouble();
        double d = scn2.nextDouble();
        System.out.println(c-d);
    }

    public static void multiplication(){
        Scanner scn3 = new Scanner(System.in);
        System.out.println("Type two numbers: ");
        double e = scn3.nextDouble();
        double f = scn3.nextDouble();
        System.out.println(e*f);
    }

    public static void division(){
        Scanner scn4 = new Scanner(System.in);
        System.out.println("Type two numbers: ");
        double g = scn4.nextDouble();
        double h = scn4.nextDouble();
        System.out.println(g/h);
    }

    public static void takingPercent(){
        Scanner scn5 = new Scanner(System.in);
        System.out.println("Type two numbers: ");
        double i = scn5.nextDouble();
        double j = scn5.nextDouble();
        System.out.println((i/100)*j);
    }
}