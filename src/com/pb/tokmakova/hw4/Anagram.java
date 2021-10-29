package com.pb.tokmakova.hw4;

import java.util.Scanner;

public class Anagram {
    static void doAnagram()
    {
        Scanner scan = new Scanner(System.in);
        String string1, string2;
        System.out.println("Введите строки: ");
        string1=scan.nextLine();
        string2=scan.nextLine();
        char [] stringArray1=string1.toLowerCase().toCharArray();
        char [] stringArray2=string2.toLowerCase().toCharArray();
        for (int i = stringArray1.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++){
                if (stringArray1[j] > stringArray1[j + 1])
                {
                    char tmp = stringArray1[j];
                    stringArray1[j] = stringArray1[j + 1];
                    stringArray1[j + 1] = tmp;
                }
            }
        }
        for (int i = stringArray2.length - 1; i > 0; i--)
        {
            for (int j = 0; j < i; j++)
            {
                if (stringArray2[j] > stringArray2[j + 1])
                {
                    char tmp = stringArray2[j];
                    stringArray2[j] = stringArray2[j + 1];
                    stringArray2[j + 1] = tmp;
                }
            }
        }
        String value1 = String.valueOf(stringArray1);
        String value2 = String.valueOf(stringArray2);
        value1 = value1.replaceAll(" ", "");
        value2 = value2.replaceAll(" ", "");
        System.out.println(value1.equalsIgnoreCase(value2));
    }
    public static void main(String[] args) {
        doAnagram();
    }
}