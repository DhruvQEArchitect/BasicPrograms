package com.neetcode;

//Container With Most Water

public class NeetCode13 {

    public static int maxArea(int[] heights) {
        int left = 0, right = heights.length - 1;
        int  maxArea = 0;
        while (left < right) {
            maxArea = Math.max(Math.min(heights[left], heights[right]) * (right - left), maxArea);
            if (heights[left] < heights[right])
                left++;
            else
                right--;
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = {1, 7, 2, 5, 4, 7, 3, 6};
        System.out.println(maxArea(height));
    }
}
