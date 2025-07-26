package com.programs;

import java.util.Arrays;

public class LeetCode34 {

    static int[] searchRange(int[] arr, int target) {
        int[] res = new int[2];
        res[0] = getFirstIndex(arr, target);
        res[1] = getLastIndex(arr, target);
        return res;
    }

    static int getFirstIndex(int[] arr, int target) {
        int index = -1, start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                index = mid;
                end = mid - 1;
            } else if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return index;
    }

    static int getLastIndex(int[] arr, int target) {
        int index = -1, start = 0, end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                index = mid;
                start = mid + 1;
            } else if (target > arr[mid]) start = mid + 1;
            else end = mid - 1;
        }
        return index;
    }

    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(arr, target)));
    }
}
