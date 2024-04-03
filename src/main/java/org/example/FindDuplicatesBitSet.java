package org.example;

import java.util.BitSet;

public class FindDuplicatesBitSet {
    public static void main(String[] args) {
    FindDuplicatesBitSet findDuplicatesBitSet=new FindDuplicatesBitSet();
    int arr[]={1,4,31000,23,11,16,26,4,23};
    findDuplicatesBitSet.findDuplicate(arr);
    }

    private final int max_number = 32000;

    public void findDuplicate(int num[]) {
        BitSet bitSet = new BitSet(max_number);
        for (int i = 0; i < num.length; i++) {
            int nums = num[i];
            if (bitSet.get(nums)) {
                System.out.println("Duplicate :" + nums);
            } else {
                bitSet.set(nums);
            }
        }
    }
}
