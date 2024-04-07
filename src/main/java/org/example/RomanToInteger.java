package org.example;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    private static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
    }

    public static int romanToInt(String s) {
        int result = 0;
        int prevValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int value = map.get(s.charAt(i));
            if (value < prevValue) {
                result -= value;
            } else {
                result += value;
            }
            prevValue = value;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
    }
}
