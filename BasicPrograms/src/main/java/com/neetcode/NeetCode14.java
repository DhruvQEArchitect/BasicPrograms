package com.neetcode;

//Trapping Rain Water
public class NeetCode14 {

    public static int trap(int[] height) {

        int[] leftArray = new int[height.length];
        int[] rightArray = new int[height.length];
        leftArray[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftArray[i] = Math.max(height[i], leftArray[i - 1]);
        }

        rightArray[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightArray[i] = Math.max(height[i], rightArray[i + 1]);
        }
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(leftArray[i], rightArray[i]) - height[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] height = {0, 2, 0, 3, 1, 0, 1, 3, 2, 1};
        System.out.println(trap(height));
    }
}
