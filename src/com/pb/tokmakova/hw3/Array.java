package com.pb.tokmakova.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner in = new Scanner(System.in);
        int i;
        int j = 0;
        //заполняем массив
        for (i = 0; i < array.length; i++) {
            System.out.print("Введите " + (j + 1) + "-й элемент массива: ");
            array[i] = in.nextInt();
            j++;
        }
        //выводим массив
        System.out.print("Ваш массив: ");
        for (i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
        System.out.println("");
//считаем сумму массива
        int sum = 0;
        for (i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        System.out.println("Сумма массива: " + sum);
        //считаем количество положительных элементов
        int count=0;
        for (i = 0; i < array.length; i++) {
            if (array[i] > 0)
                count += 1;
        }
        System.out.println("Количество положительных элементов: "+ count);
//сортируем методом пузырька
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (i = 0; i < array.length-1; i++) {
                if(array[i] > array[i+1]){
                    isSorted = false;

                    buf = array[i];
                    array[i] = array[i+1];
                    array[i+1] = buf;
                }
            }
        }
        System.out.println("Сортировка пузырьком: "+ Arrays.toString(array));
    }


}
