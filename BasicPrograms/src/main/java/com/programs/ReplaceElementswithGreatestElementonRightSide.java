package com.programs;

import java.util.Arrays;
import java.util.Stack;

public class ReplaceElementswithGreatestElementonRightSide {

    static int[] replaceElements(int[] arr) {
        int max = -1, n = arr.length;
        int i = n - 1, j = n - 2;
        int[] newArr = new int[n];
        //last cell fill with 0
        newArr[newArr.length - 1] = -1;
        while (i >= 0 && j >= 0) {
            if (arr[i] > max) {
                max = arr[i];
                newArr[j] = max;
                i--;
                j--;
            } else {
                newArr[j] = max;
                i--;
                j--;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        System.out.println(Arrays.toString(replaceElements(arr)));
    }
}
