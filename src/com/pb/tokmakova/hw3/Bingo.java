package com.pb.tokmakova.hw3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args) {
        System.out.println("Угадайте задуманное число");
        System.out.println("Для выхода из программы введите stop");

        Random random=new Random();
        int hiddenX = random.nextInt(101);
        System.out.println("(случайное число: " + hiddenX+")");

        Scanner in = new Scanner(System.in);

        System.out.printf("Введите загаданное число" );

        //int attempt = 0;           // Счетчик попыток.
        int findX = in.nextInt();
       while (findX!=hiddenX)

            if (findX==hiddenX)
            {
                System.out.println("Вы угадали!" + hiddenX);
            }
            if (findX!=hiddenX)
            {
                if (findX<hiddenX)
                    System.out.println("Вы не угадали, загаданное число больше вашего");

                 if (findX>hiddenX)
                     System.out.println("Вы не угадали, загаданное число меньше вашего");
             }
       // System.out.println("Конец игры!");
        }
            }


