package ru.zolotarev.task8;

import java.util.Scanner;

public class MinistryOfTruth {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputString = scan.nextLine();
        inputString = inputString.replace("war","peace");
        inputString = inputString.replace("freedom","slavery");
        inputString = inputString.replace("ignorance","strength");
        System.out.println(inputString);
        System.out.println("Big Brother is watching you!");
    }

}
