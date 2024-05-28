package org.example;

import java.util.Scanner;

public class ExcelSheetColumnNumber {
    public static void main(String[] args) {
        ExcelSheetColumnNumber test = new ExcelSheetColumnNumber();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please pass some value ");
        String s = scanner.nextLine();
        System.out.println(test.titleToNumber(s));
    }

    public int titleToNumber(String columnTitle) {
        int ans = 0;
        for (final char c : columnTitle.toCharArray())
            ans = ans * 26 + c - '@';
        return ans;
    }
}
