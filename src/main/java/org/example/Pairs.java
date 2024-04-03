package org.example;

import java.util.*;

public class Pairs {
    public static void main(String[] args) {
        Pairs pairs = new Pairs();
        int N = 4;
        int arr[] = {-1, -4, 0, -5, 10, 2, 3, 4, 5};
        List<String> case1 = pairs.getPairs(arr, N);
        System.out.println(case1);
    }

    public List<String> getPairs(int[] num, int N) {
        if (num == null || num.length < 2) {
            return Collections.emptyList();
        }
        List<String> result = new ArrayList<>();
        Arrays.sort(num);
        int l = 0;
        int r = num.length - 1;
        while (l < r) {
            int s = num[l] + num[r];
            if (s == N) {
                result.add("(" + num[l] + "," + num[r] + ")");
                l++;
                r--;
            } else {
                if (s < N) {
                    l++;
                } else {
                    r--;
                }
            }
        }
        return result;
    }
}
