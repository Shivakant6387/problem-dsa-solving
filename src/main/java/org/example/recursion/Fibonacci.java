package org.example.recursion;

public class Fibonacci {
    static int num1 = 0, num2 = 1, num3 = 0;

    static void fibonacci(int count) {
        if (count > 0) {
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(" " + num3);
            fibonacci(count - 1);
        }
    }

    public static void main(String[] args) {
        int count = 15;
        System.out.print(num1 + " " + num2);
        fibonacci(count - 2);
    }
}
