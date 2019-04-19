package ru.zolotarev.task3;

import java.util.Scanner;

public class DescribeNumber {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (; ; ) {
            System.out.println("Enter number to describe: ");

            int a = in.nextInt();
            String Positiveness;
            String Evenness;

            if (a > 0) {
                Positiveness = "positive";
            } else {
                Positiveness = "negative";
            }

            if (a % 2 == 0) {
                Evenness = "even";
            } else {
                Evenness = "odd";
            }

            System.out.println("Number " + a + " is " + Positiveness + " and " + Evenness + ". " +
            "Type 'again' for more counts or any other key to quit");

            String usrChoice = in.next();
            if (usrChoice.equalsIgnoreCase("again")){
                continue;
            } else {
                break;
            }
        }
    }
}