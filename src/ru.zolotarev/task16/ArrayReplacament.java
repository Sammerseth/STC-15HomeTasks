package ru.zolotarev.task16;


import java.util.Arrays;

public class ArrayReplacament {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(array));
        int k = 1;
        for (int i = 0; i < k; i++) {
            int tmp = array[0];
            for (int j = 0; j < array.length - 1; j++)
                array[j] = array[j+1];
            array[array.length - 1] = tmp;
        }
        array[array.length-1] = 0;
        System.out.println(Arrays.toString(array));

    }
}
