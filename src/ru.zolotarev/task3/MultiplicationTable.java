package ru.zolotarev.task3;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String... args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter height of table: ");
        int n = in.nextInt();
        System.out.print("Enter width of table: ");
        int l = in.nextInt();

        for (int i = 1; i < n + 1; i++) {
            for (int k = 1; k < l + 1; k++) {
                System.out.print( k + "*" + i + "=" + (k * i) + " ");
            }
            System.out.println();
        }
    }
}
