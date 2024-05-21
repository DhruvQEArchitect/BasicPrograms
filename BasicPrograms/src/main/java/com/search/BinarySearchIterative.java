package com.search;

public class BinarySearchIterative {

    static int binarySearch(int start, int end, int[] arr, int ele) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (ele == arr[mid]) {
                return mid;
            } else if (ele > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {11, 12, 13, 14, 15, 16};
        int result = binarySearch(0, arr.length - 1, arr, 15);
        if (result == -1)
            System.out.println("Element not found");
        else System.out.println("Element found at location: " + (result + 1));
    }
}
