package com.programs;

public class LeetCode33 {

    static int search(int[] nums, int target) {
        return modifiedBinarySearch(nums, target, 0, nums.length - 1);
    }

    static int modifiedBinarySearch(int[] nums, int target, int left, int right) {
        if (left > right)
            return -1;

        int mid = left + (right - left) / 2;
        if (nums[mid] == target)
            return mid;
        if (nums[left] <= nums[mid]) {
            if (target >= nums[left] && target <= nums[mid])
                return modifiedBinarySearch(nums, target, left, mid - 1);
            else return modifiedBinarySearch(nums, target, mid + 1, right);
        } else {
            if (target >= nums[mid] && target <= nums[right])
                return modifiedBinarySearch(nums, target, mid + 1, right);
            else return modifiedBinarySearch(nums, target, left, mid - 1);
        }
    }
}
