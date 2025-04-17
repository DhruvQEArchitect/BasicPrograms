package com.programs;

import java.util.Arrays;

public class LongestCommonPrefix {

    static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0, len = strs[0].length();
        while (i < len) {
            if (strs[0].charAt(i) != strs[strs.length - 1].charAt(i))
                return "";
            if (strs[0].charAt(i) == strs[strs.length - 1].charAt(i)) {
                stringBuilder.append(strs[0].charAt(i));
            }
            i++;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow"};
        System.out.println(longestCommonPrefix(arr));
    }
}
