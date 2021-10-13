package com.pb.tokmakova.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        int operand1 = in.nextInt();

        System.out.print("Введите число 2: ");
        int operand2 = in.nextInt();

        System.out.print("Введите знак (+, -, *, /): ");
        String sign = in.next();

       switch (sign){
           case "+":
               System.out.print("Результат:" + (operand1+operand2));
               break;
           case "-":
               System.out.print("Результат:"+ (operand1-operand2));
               break;
           case "*":
               System.out.print("Результат:"+ (operand1*operand2));
               break;
           case "/":
               if (operand2==0)
                   System.out.print("Ошибка: Деление на 0 запрещено");
               else
               System.out.print("Результат:"+(operand1/operand2));
               break;
       }
    }
}
