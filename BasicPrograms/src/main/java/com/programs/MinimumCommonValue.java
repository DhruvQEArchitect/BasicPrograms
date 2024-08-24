package com.programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class MinimumCommonValue {

    public static int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            hashSet.add(nums1[i]);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashSet.contains(nums2[i])) {
                return nums2[i];
            }
        }
        return -1;
    }

    public static int getCommonValue(int[] nums1, int[] nums2) {
        int i = 0, j = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                return nums1[i];
            } else if (nums1[i] < nums2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3}, nums2 = {4};
        System.out.println(getCommonValue(nums1, nums2));
    }
}
