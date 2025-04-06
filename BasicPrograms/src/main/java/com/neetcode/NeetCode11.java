package com.neetcode;

//Two Integer Sum II

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;

public class NeetCode11 {

    public static int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] > target) {
                j--;
            } else if (numbers[i] + numbers[j] < target) {
                i++;
            } else {

                return new int[]{i + 1, j + 1};
            }
        }
        return null;

    }

    public static void main(String[] args) {
        int[] numbers = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }
}
