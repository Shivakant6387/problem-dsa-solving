package org.example;

public class StringRemoveStartWithZero {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("077");
        StringBuilder strBuilder = new StringBuilder(str);
        int ind = 0;
        for (int i = 0; i < strBuilder.length(); i++) {
            if (strBuilder.charAt(i) != '0') {
                ind = i;
                break;
            }
        }
        strBuilder.delete(0, ind);
        System.out.println(strBuilder.toString());
    }
}
