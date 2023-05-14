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
        int max =0;
        int i = 0;
        int min = arr[i];
        for (i = 0; i< arr.length; i++){

            System.out.println(" ________________ " + "Итерация - " + i + " ________________ ");
            System.out.println("Значение arr[" + i + "] = " + arr[i]);
            System.out.println("Значение max: " + max);
            System.out.println("Значение min: " + min);
            if (max<arr[i]){
                max=arr[i];

            } else if(min>arr[i]){
                min=arr[i];

            }
        }
        System.out.println("___________________________________Конец цикла_________________________");
        System.out.println("Значение max: " + max);
        System.out.println("Значение min: " + min);

    }
}