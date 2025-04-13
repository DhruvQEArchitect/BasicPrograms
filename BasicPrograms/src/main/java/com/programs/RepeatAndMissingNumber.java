package com.programs;

import java.util.*;

public class RepeatAndMissingNumber {

    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        List<Integer> list = new ArrayList<>();
        int n = grid.length;
        int actualSum = 0;
        int[] res = new int[2];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                actualSum += grid[i][j];
                list.add(grid[i][j]);
            }
        }
        HashSet<Integer> hashSet = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            if (hashSet.add(list.get(i)) == false)
                res[0] = list.get(i);
        }

        int expectedSum = (n * n * (n * n + 1)) / 2;
        res[1] = expectedSum + res[0] - actualSum;
        return res;
    }

    public static void main(String[] args) {
        int[][] grid = {{1, 3}, {2, 2}};
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }
}
