package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        var input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        try {
           if (num2 != 0);
        }catch (ArithmeticException e){
            System.err.println("Arithmetic Exception: " + e.getMessage());
        }

        Divide divide = new Divide(num1, num2);

        System.out.println(divide.divideNumbers(num1, num2));




    }
}
