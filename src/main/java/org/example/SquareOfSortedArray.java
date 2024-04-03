package org.example;

import java.util.Arrays;
import java.util.List;

public class SquareOfSortedArray {
    public static void main(String[] args) {
        SquareOfSortedArray squareOfSortedArray = new SquareOfSortedArray();
        int nums[] = {-10, -3, 1, 7, 9, 15};
        System.out.println(Arrays.toString(squareOfSortedArray.squareOfSortedArray(nums)));
    }

    public int[] squareOfSortedArray(int[] num) {
        int n = num.length;
        int res[] = new int[n];
        for (int i = 0; i < n; i++)
            res[i] = num[i] * num[i];
        Arrays.sort(res);
        return res;
    }
}
