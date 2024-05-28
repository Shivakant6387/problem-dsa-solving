package org.example;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {
    public static void main(String[] args) {
        ContainsDuplicateII ContainsDuplicateII = new ContainsDuplicateII();
//        int num[] = {1, 2, 3, 1};
//        int num[] = {1,0,1,1};
        int num[] = {1,2,3,1,2,3};
//        int key = 3;
//        int key = 1;
        int key = 2;
        System.out.println(ContainsDuplicateII.containsDuplicate(num, key));
    }

    public boolean containsDuplicate(int[] num, int key) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (!map.containsKey(num[i])) {
                map.put(num[i], i);
            } else {
                int pastIndex = map.get(num[i]);
                if (Math.abs(pastIndex - i) <= key) {
                    return true;
                } else {
                    map.put(num[i], i);
                }
            }
        }
        return false;
    }
}
