package org.example.recursion;

public class PrintNTo1 {
    public static void main(String[] args) {
        printNToOne(10);
        printNToOnes(5);
    }

    public static void printNToOne(int num) {
        if (num == 0)
            return;
        System.out.println(num + " ");
        printNToOne(num - 1);
    }

    public static int printNToOnes(int num) {
        if (num == 0)
            return 1;
        System.out.println(num + " ");
        return printNToOnes(num - 1);
    }
}
