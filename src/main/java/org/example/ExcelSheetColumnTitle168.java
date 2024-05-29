package org.example;

public class ExcelSheetColumnTitle168 {
    public static void main(String[] args) {
        ExcelSheetColumnTitle168 ExcelSheetColumnTitle168 = new ExcelSheetColumnTitle168();
        System.out.println(ExcelSheetColumnTitle168.convertToTitle(1));
    }

    public String convertToTitle(int num) {
        String result = "";
        while (num > 0) {
            num--;
            result = (char) (num % 26 + 'A') + result;
            num = num / 26;
        }
        return result;
    }
}
