package com.programs;

public class LeetCode724 {

    static int pivotIndex(int[] nums) {
        int leftSum = 0, rightSum = 0;
        for (int num : nums)
            rightSum += num;

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (rightSum == leftSum) {
                return i;
            }
            leftSum += nums[i];
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {2, 5};
        System.out.println(pivotIndex(arr));
    }
}
