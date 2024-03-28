package org.example.recursion;

public class PrintOneTON {
    public static void main(String[] args) {
        printOneToN(10);
    }

    public static void printOneToN(int num) {
        if (num == 0)
            return;
        printOneToN(num - 1);
        System.out.println(num);
    }
}
