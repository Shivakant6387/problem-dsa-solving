package org.example;

public class CountDigits {
    public static void main(String[] args) {
        int num=12313;
        System.out.println(countDigit(num));


    }
   static int countDigit(int num){
        int res=0;
        while(num>0){
            num=num/10;
            res++;
        }
        return res;
    }
}
