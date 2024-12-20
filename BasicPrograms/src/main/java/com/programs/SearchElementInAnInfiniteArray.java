package com.programs;

public class SearchElementInAnInfiniteArray {

    static int searchElementInAnInfiniteArray(int[] arr, int ele) {

        int low = 0, high = 1, val = arr[0];
        while (val < ele) {
            low = high;
            if (2 * high < arr.length - 1) {
                high = 2 * high;
                val = arr[high];
            } else {
                high = arr.length - 1;
                val = arr[high];
                break;
            }
        }
        return binarySearch(arr, low, high, ele);
    }

    static int binarySearch(int[] arr, int start, int end, int ele) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (ele == arr[mid])
                return mid;
            if (ele > arr[mid])
                return binarySearch(arr, mid + 1, end, ele);
            return binarySearch(arr, start, mid - 1, ele);
        }
        return -1;
    }


    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        System.out.println(searchElementInAnInfiniteArray(arr, 1000));
    }

}
