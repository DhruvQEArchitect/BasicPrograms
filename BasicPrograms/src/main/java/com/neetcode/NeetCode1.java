package com.neetcode;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//Contains Duplicate

public class NeetCode1 {

    public static boolean hasDuplicate(int[] nums) {
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() > 1) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0};
        System.out.println(hasDuplicate(nums));
    }
}
