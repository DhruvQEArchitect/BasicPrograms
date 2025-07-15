package com.programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Objects;

public class RemoveDuplicatesFromSortedArray {

    static int removeDuplicates(int[] nums) {

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k++] = nums[i];
            }
        }
        return k;

//        LinkedHashSet<Integer> hashSet = new LinkedHashSet<>();
//        for (int val : nums)
//            hashSet.add(val);
//
//        ArrayList<Integer> list = new ArrayList<Integer>(hashSet);
//        Object[] arr = hashSet.toArray();
//        for (int i = 0; i < arr.length; i++) {
//            nums[i] = (int) arr[i];
//        }
//        System.out.println(Arrays.toString(nums));
//
//        return list.size();

    }

    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        System.out.println(removeDuplicates(arr));
    }

}
