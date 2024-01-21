package org.example;

public class PalindromeNumbers {
    public static void main(String[] args) {
        PalindromeNumbers palindromeNumbers=new PalindromeNumbers();
        int n=10;
        System.out.println(palindromeNumbers.isPalindrome(n));
    }
    boolean isPalindrome(int n){
        int rev=0;
        int temp=n;
        while(temp!=0){
            int ld =temp%10;
            rev=rev*10+ld;
            temp=temp/10;
        }
        return (rev==n);
    }
}
