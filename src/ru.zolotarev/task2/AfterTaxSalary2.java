package ru.zolotarev.task2;

import java.util.Scanner;

public class AfterTaxSalary2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                                                            //Scanner activation

        for (; ; ) {                                                                                                    //Main cycle
            System.out.println("Welcome to salary calculator. Type your salary");
            int usrSlr = in.nextInt();
                System.out.println("You will be paid " + (usrSlr - (usrSlr * 0.13)));
                System.out.println("Type again for more counts or any other key for exit");
                String usrChoice = in.next();
                if (usrChoice.equalsIgnoreCase("again")) {
                    continue;
                }
                else {
                    break;
                }
         }
    }
}
