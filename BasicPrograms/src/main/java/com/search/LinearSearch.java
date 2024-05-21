package com.search;

import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 14, 5, 6};
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the element to search: ");
        int element = s.nextInt();
        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (element == arr[i]) {
                pos = i;
                break;
            }
            if (element != arr[i]) {
                System.out.println("Element not found");
                System.exit(0);
            }
        }
        System.out.println("Element found at location: " + (pos + 1));
    }
}
