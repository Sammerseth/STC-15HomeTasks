package ru.zolotarev.task16;

public class ArrayReverse {
    public static void main(String[] args) {
        int [] array = {1, 2 , 3, 4};
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(array[0] + " " + array[1] + " " + array[2] + " " + array[3]);
    }
}
