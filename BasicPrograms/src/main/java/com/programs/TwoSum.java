package com.programs;

import java.util.HashMap;

public class TwoSum {

    public static void main(String[] args) {
        int[] arr = {1, 22, 12, 11, 14};
//        0, 1 22, 1 21, 2
        int sum = 36;
        int[] res = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int target = sum - arr[i];

            if (hashMap.containsKey(target)) {
                res[0] = i;
                res[1] = hashMap.get(target);
            } else hashMap.put(arr[i], i);
            
        }
        System.out.println("Two elements are at position: " + res[0] + "--" + res[1]);
    }
}
