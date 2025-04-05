package com.neetcode;

import java.util.Arrays;
import java.util.HashMap;

//Two Sum

public class NeetCode3 {

    public static int[] twoSum(int[] nums, int sum) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        int[] res = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int target = sum - nums[i];
            if (hashMap.containsKey(target)) {
                res[0] = i;
                res[1] = hashMap.get(target);
            } else hashMap.put(nums[i], i);
        }
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6};
        int sum = 7;
        System.out.println(Arrays.toString(twoSum(arr, sum)));
    }
}
