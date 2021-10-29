package com.pb.tokmakova.hw4;

import java.util.Scanner;

public class CapitalLetter {
    static void UpperCase() {
        Scanner inputString = new Scanner(System.in);
        String newString = inputString.nextLine();
        char[] newChars = newString.toCharArray();
        newChars[0] = Character.toUpperCase(newChars[0]);

        for (int i = 0; i < newChars.length - 1; i++) {
            if (newChars[i] == ' ') {
                newChars[i + 1] = Character.toUpperCase(newChars[i + 1]);
            }
        }
        newString = new String(newChars);
        System.out.println("Результат: "+newString);
    }
    public static void main(String[] args)
    {
        System.out.print("Введите фразу: ");
        UpperCase();
    }

}