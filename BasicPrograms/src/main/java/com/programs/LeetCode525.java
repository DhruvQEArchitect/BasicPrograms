package com.programs;

import java.util.HashMap;

public class LeetCode525 {

    static int findMaxLength(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) nums[i] = -1;
        }

        int sum = 0, maxLength = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (hashMap.containsKey(sum)) {
                int existingValue = hashMap.get(sum);
                maxLength = Math.max(maxLength, i - existingValue);
            } else {
                hashMap.put(sum, i);
            }
        }
        return maxLength;
    }
}
