package com.neetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class NeetCode7 {

    public static int longestConsecutive(int[] nums) {
        int maxLength = 0;
        if (nums.length == 0)
            return 0;
        HashMap<Integer, Boolean> visitedMap = new HashMap<>();
        for (int i : nums) {
            visitedMap.put(i, Boolean.FALSE);
        }

        for (int num : nums) {
            int currentLength = 1;

            int nextNum = num + 1;
            while (visitedMap.containsKey(nextNum) && visitedMap.get(nextNum) == false) {
                currentLength++;
                visitedMap.put(nextNum, Boolean.TRUE);
                nextNum++;
            }

            int prevNum = num - 1;
            while (visitedMap.containsKey(prevNum) && visitedMap.get(prevNum) == false) {
                currentLength++;
                visitedMap.put(prevNum, Boolean.TRUE);
                prevNum--;
            }
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;

    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1, 2};
        System.out.println(longestConsecutive(nums));
    }

}
