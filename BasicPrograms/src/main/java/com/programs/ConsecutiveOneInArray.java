package com.programs;

public class ConsecutiveOneInArray {

    public static void main(String[] args) {
        int count = 0, maxCount = 0;
        int[] arr = {0, 1, 1, 0, 0, 0, 1, 1, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                count = 0;
            } else {
                count++;
                maxCount = Math.max(count, maxCount);
            }
        }
        System.out.println(maxCount);
    }
}
