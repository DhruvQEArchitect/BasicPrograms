package com.programs;

import java.util.ArrayList;
import java.util.List;

//46. Permutations
public class Permutations {

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        backTrack(list, new ArrayList<>(), nums);
        return list;
    }

    public static void backTrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {
        if (tempList.size() == nums.length) {
            list.add(new ArrayList<>(tempList));
            return;
        }

        for (int num : nums) {
            if (tempList.contains(num))
                continue;
            tempList.add(num);
            backTrack(list, tempList, nums);
            tempList.remove(tempList.size() - 1);
        }

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
    }
}
