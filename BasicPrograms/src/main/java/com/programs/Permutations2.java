package com.programs;

import java.util.ArrayList;
import java.util.List;

//LeetCode 47. Permutations II
public class Permutations2 {

    public static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(), nums, new boolean[nums.length]);
        return list;
    }

    public static void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums, boolean[] used) {

        if (tempList.size() == nums.length && !list.contains(tempList)) {
            list.add(new ArrayList<>(tempList));
            return;
        }


        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            tempList.add(nums[i]);
            backTrack(list, tempList, nums, used);
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        System.out.println(permuteUnique(nums));
    }
}
