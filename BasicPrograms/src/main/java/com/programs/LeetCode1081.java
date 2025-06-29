package com.programs;

import java.util.Stack;

public class LeetCode1081 {

    static String smallestSubsequence(String s) {
        boolean[] seen = new boolean[26];
        int[] lastIndex = new int[26];
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int index = ch - 'a';

            if (seen[index]) continue;

            while (!stack.isEmpty() && ch < stack.peek() && i < lastIndex[stack.peek() - 'a']) {
                seen[stack.pop() - 'a'] = false;
            }
            stack.push(ch);
            seen[index] = true;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (char ch : stack)
            stringBuilder.append(ch);
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        System.out.println(smallestSubsequence("cbacdcbc"));
    }
}
