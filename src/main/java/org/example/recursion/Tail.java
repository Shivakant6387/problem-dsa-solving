package org.example.recursion;

public class Tail {
    public static void main(String[] args) {
        int result=tail(2,4);
        System.out.println(result);
    }

    public static int tail(int num, int k) {
        if (num == 0 || num == 1)
            return k;
        return tail(num - 1, k * num);
    }
}
