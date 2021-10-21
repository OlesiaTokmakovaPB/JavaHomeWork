package com.pb.tokmakova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int X = random.nextInt(101);
        System.out.println("Твоя задача угадать загаданное число. Для выхода из игры введи 00");
        Scanner in = new Scanner(System.in);
        int attempt = 0;
        int findX=0;
        while(findX!=X) {
            attempt++;
            System.out.print("Введи загаданное число: ");
            findX = in.nextInt();
            if (findX == 00)
            {
                System.out.println("Конец игры");
                break;
            }
            if (findX < X)
                System.out.println("Ты не угадал, нужно больше");
            else if (findX > X)
                System.out.println("Ты не угадал, нужно меньше");
            else {
                System.out.println("Поздравляем! Ты угадал число c "+attempt+" попытки");
                System.out.println("Конец игры.");
            break;}

        }
        }
    }





