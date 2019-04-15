package ru.zolotarev.task2;
import java.util.Scanner;

public class PtrlCost2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);                                                                            //Scanner activation

        int cost92 = 41;                                                                                                // It
        int cost95 = 45;                                                                                                // is
        int costDF = 46;                                                                                                // all
        String allowedType1 = "92";                                                                                     // necessary
        String allowedType2 = "95";                                                                                     // for
        String allowedType3 = "DF";                                                                                     // cycles
                                                                                                                        // variables

        for (; ; ) {                                                                                                    //Start main Cycle (it's endless)


            System.out.print("Welcome to petrolium cost calculator. You can calcute cost of 3 marks of petroleum: 92, 95 and DF. Print a necessary mark of petroleum: ");            //Printing start message

            String UsrChoose = in.next();                                                                               // User choose mark

            if (UsrChoose.equals(allowedType1)) {                                                                       //Cycle for 92
                System.out.print("You choose 92. Type how much litres you need: ");
                int UsrAmount = in.nextInt();
                System.out.println(UsrAmount + " liters of 92 is cost " + (cost92 * UsrAmount));

                System.out.print("Thank you for using calculator.Type 'again' for additional calculating or press any other key for exit "); //Cycle for additional counts
                String usrChoose2 = in.next();
                if (usrChoose2.equalsIgnoreCase("again")) {
                    continue;
                } else {
                    System.out.println("See you later!");
                    break;
                }
            } else if (UsrChoose.equals(allowedType2)) {                                                                  //Cycle for 95
                System.out.print("You choose 95. Type how much litres you need: ");
                int UsrAmount = in.nextInt();
                System.out.println(UsrAmount + " liters of 92 is cost " + (cost95 * UsrAmount));

                System.out.println("Thank you for using calculator.Type 'again' for additional calculating or press any other key for exit "); //Cycle for additional counts
                String usrChoose3 = in.next();
                if (usrChoose3.equalsIgnoreCase("again")) {
                    continue;
                } else {
                    System.out.println("See you later!");
                    break;
                }
            } else if (UsrChoose.equalsIgnoreCase(allowedType3)) {                                                        //Cycle for DF
                System.out.print("You choose DF. Type how much litres you need: ");
                int UsrAmount = in.nextInt();
                System.out.println(UsrAmount + " liters of  is cost " + (costDF * UsrAmount));

                System.out.println("Thank you for using calculator.Type 'again' for additional calculating or press any other key for exit"); //Cycle for additional counts
                String usrChoose4 = in.next();
                if (usrChoose4.equalsIgnoreCase("again")) {
                    continue;
                } else {
                    System.out.println("See you later!");
                    break;
                }
            } else {
                System.out.println("Incorrect input. Type 'again' to try more times or press any other key for exit");    //Cycle for incorrect input
                String UsrChoose5 = in.next();
                if (UsrChoose5.equalsIgnoreCase("again")) {
                    continue;
                } else {
                    break;
                }
            }
        }
    }
}