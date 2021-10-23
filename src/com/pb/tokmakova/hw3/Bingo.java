package com.pb.tokmakova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        Random random = new Random();
        int X = random.nextInt(101);
        System.out.println("Твоя задача угадать число от 0 до 100. Для выхода из игры введи число больше 100");
        Scanner in = new Scanner(System.in);
        int attempt = 0;
        while(true)
        {
            attempt++;
            System.out.print("Введи загаданное число: ");
            int findX = in.nextInt();
            if (findX >100)
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





