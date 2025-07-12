package com.programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class WordBreak {

    static boolean wordBreak(String s, List<String> wordDict) {

        HashSet<String> stringHashSet = new HashSet<>(wordDict);
        int n = s.length();
        boolean[] dp = new boolean[n + 1];
        dp[0] = true;

        int maxLen = 0;
        for (String word : stringHashSet) {
            maxLen = Math.max(maxLen, word.length());
        }

        for (int i = 1; i <= n; i++) {
            for (int j = i - 1; j >= Math.max(0, i - maxLen); j--) {
                if (dp[j] && stringHashSet.contains(s.substring(j, i))) {
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[n];

    }

    public static void main(String[] args) {
        String s = "catsandog";
        List<String> wordDict = Arrays.asList("cats", "dog", "sand", "and", "cat");
        System.out.println(wordBreak(s, wordDict));
    }
}
