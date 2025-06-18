package com.programs;

import java.util.*;

public class LeetCode350 {

    static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
        for (int val : nums1) {
            hashMap.put(val, hashMap.getOrDefault(val, 0) + 1);
        }

        List<Integer> list = new ArrayList<>();
        for (int val : nums2) {
            if (hashMap.getOrDefault(val, 0) > 0) {
                list.add(val);
                hashMap.put(val, hashMap.getOrDefault(val, 0) - 1);
            }
        }

        int[] resultArray = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            resultArray[i] = list.get(i);
        }
        return resultArray;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
