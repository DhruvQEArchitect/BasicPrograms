package com.sort;

//75. Sort Colors
public class SortColors {

    public static void sortColors(int[] nums) {
        int middle = 0, start = 0, end = nums.length - 1;

        while (middle <= end) {
            if (nums[middle] == 0) {
                swap(start, middle, nums);
                middle++;
                start++;
            } else if (nums[middle] == 1) {
                middle++;
            } else {
                swap(middle, end, nums);
                end--;
            }
        }
    }

    public static void swap(int first, int second, int[] nums) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }

}
