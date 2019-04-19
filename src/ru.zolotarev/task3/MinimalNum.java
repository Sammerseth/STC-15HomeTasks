package ru.zolotarev.task3;

import java.util.Scanner;

public class MinimalNum {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        for (; ; ) {

            System.out.println("Enter numbers: ");

            int a = in.nextInt();
            int b = in.nextInt();

            if (a > b) {
                System.out.println(b + " is minimal number");
            } else {
                System.out.println(a + " is minimal number");
            }

            System.out.print("Type 'again' for more counst or any other key to quit ");
            String usrChoice = in.next();

            if (usrChoice.equalsIgnoreCase("again")) {
                continue;
            } else {
                break;
            }
        }
    }
}