package com.neetcode;

//Top K Frequent Elements

import java.util.*;

public class NeetCode5 {

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        List<Integer>[] bucket = new List[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                hashMap.put(nums[i], hashMap.get(nums[i]) + 1);
            } else {
                hashMap.put(nums[i], 1);
            }
        }

        for (int key : hashMap.keySet()) {
            int num = hashMap.get(key);
            if (bucket[num] == null) {
                bucket[num] = new ArrayList<>();
            }
            bucket[num].add(key);
        }

        int[] res = new int[k];
        int count = 0;
        for (int i = bucket.length - 1; i >= 0 && count < k; i--) {
            if (bucket[i] != null) {
                for (Integer integer : bucket[i]) {
                    res[count++] = integer;
                }
            }
        }


        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 2, 3, 3, 3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

}
