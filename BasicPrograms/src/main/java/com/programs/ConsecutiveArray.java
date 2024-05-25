package com.programs;

public class ConsecutiveArray {

    static boolean isConsecutive(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16};
        System.out.println(isConsecutive(arr));
    }
}
