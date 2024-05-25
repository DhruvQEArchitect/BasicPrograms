package com.programs;

import java.util.HashSet;

public class Union {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        int[] arr2 = {2, 5, 7, 8};

        /**
         * program to find union of two arrays
         */

        HashSet<Integer> hashSet = new HashSet<>();
        for (int val : arr1)
            hashSet.add(val);

        for (int val : arr2) {
            if (!hashSet.contains(val))
                hashSet.add(val);
        }
        System.out.println(hashSet);
    }
}
