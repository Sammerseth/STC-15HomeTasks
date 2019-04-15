package ru.zolotarev.task2;

import java.util.Scanner;

public class SecondsToHours2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);                                                                            //Activate scanner

        for (; ;) {                                                                                                     //Main cycle
            System.out.println("Welcome to time converter. Type amount of seconds you need to convert: ");
            int usrAmount = in.nextInt();
            System.out.println(usrAmount + " seconds is " + (usrAmount / 3600) + " hours and " + ((usrAmount % 3600) / 60) + " minutes ");
            System.out.println("Type 'again' for more counts or press any other key for exit");
            String usrChoice = in.next();
            if (usrChoice.equalsIgnoreCase("again")) {                                                      //Cycle for more counts
                continue;
            }
            else {
                break;
            }
        }
    }
}