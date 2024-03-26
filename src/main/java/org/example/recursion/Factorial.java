package org.example.recursion;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter some number :");
        int number = scanner.nextInt();
        System.out.println("Factorial number :" + factorial(number));
    }

    static int factorial(int number) {
        if (number == 1)
            return 1;
        else
            return (number * factorial(number - 1));
    }
}
