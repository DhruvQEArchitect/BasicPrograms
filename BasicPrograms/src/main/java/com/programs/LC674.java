package com.programs;

public class LC674 {

    static int findLengthOfLCIS(int[] nums) {
        int max = 1, currentLength = 1, i = 1;
        while (i < nums.length) {
            if (nums[i] > nums[i - 1]) {
                currentLength++;
            } else {
                currentLength = 1;
            }
            max = Math.max(currentLength, max);
            i++;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 4, 7};
        System.out.println(findLengthOfLCIS(nums));
    }
}
