package com.neetcode;

import java.util.*;

//3Sum
public class NeetCode12 {

    public static List<List<Integer>> threeSum(int[] nums) {
        if (nums == null || nums.length < 3)
            return new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    hashSet.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;
                } else if (sum > 0) right--;
                else left++;
            }

        }
        return new ArrayList<>(hashSet);
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        System.out.println(threeSum(nums));

    }
}
