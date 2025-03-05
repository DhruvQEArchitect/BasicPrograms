package com.programs;

import java.util.Stack;

public class PreviousSmallerElement {

    public static void getPreviousSmallerElement(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && stack.peek() >= arr[i]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                System.out.print(-1 + ",");
            } else {
                System.out.print(stack.peek() + ",");
            }
            stack.push(arr[i]);
        }
    }

    public static void main(String[] args) {
        int[] arr = {4, 10, 5, 8, 20, 15, 3, 12};
        getPreviousSmallerElement(arr);
    }
}
