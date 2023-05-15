package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

//** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без
//помощи интернета);

import java.lang.reflect.Array;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {
        int[] arr= { 6, 5, 4, 3, 2, 50, 7, 8, 9, 10, 11, 12 };
        Arrays.sort(arr);
       // for (int num : arr) {
            //System.out.println(num + " ");
       // }

        System.out.println(arr[arr.length-1]);

    }
}