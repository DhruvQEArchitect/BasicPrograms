package com.programs;

public class SingleNumber {

    static int singleNumber(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans ^= nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {3, 2, 3};
        System.out.println(singleNumber(arr));
    }
}
