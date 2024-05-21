package com.search;

public class BinarySearch {

    /**
     * this approach uses recursion to do binary search and requires below parameters to do the search
     * For doing binary search array has to be sorted
     *
     * @param start
     * @param end
     * @param arr
     * @param ele
     * @return
     */
    static int binarySearch(int start, int end, int[] arr, int ele) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (ele == arr[mid])
                return mid;
            if (ele > arr[mid])
                return binarySearch(mid + 1, end, arr, ele);
            else return binarySearch(start, mid - 1, arr, ele);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int result = binarySearch(0, arr.length - 1, arr, 6);
        if (result == -1)
            System.out.println("Element not found");
        else {
            System.out.println("Element found at location: " + (result + 1));
        }
    }
}
