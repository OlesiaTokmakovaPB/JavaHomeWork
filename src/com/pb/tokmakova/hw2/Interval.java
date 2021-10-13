package com.pb.tokmakova.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int number = in.nextInt();

        {
            if (number>=0 &&number<=14) {
                System.out.print("Число в промежутке от 0 до 14");
            }
            if (number>=15 &&number<=35) {
                System.out.print("Число в промежутке от 15 до 35");
            }
            if (number>=36 &&number<=50) {
                System.out.print("Число в промежутке от 35 до 60");
            }
            if (number>=51 &&number<=100) {
                System.out.print("Число в промежутке от 51 до 100");
            }
            else if (number>100){
                System.out.print("Число не входит ни в один диапазон");
            }

        }



    }

}
