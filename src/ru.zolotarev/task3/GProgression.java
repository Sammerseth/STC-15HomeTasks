package ru.zolotarev.task3;

import java.util.Scanner;

public class GProgression {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first number of progression: ");
        int Number = in.nextInt();
        System.out.println("Enter amount of iterations: ");
        int Iterations = in.nextInt();
        System.out.println("Enter step of progression: ");
        int Step = in.nextInt();
        for (int i = 0; i < Iterations; i++) {
            Number = Number * Step;
            System.out.print(Number + " ");
        }
    }
}