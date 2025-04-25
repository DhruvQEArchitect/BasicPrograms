package com.programs;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {


    static void backTrack(int open, int close, String ans, List<String> list, int n) {
        if (open == n && close == n) {
            list.add(ans);
            return;
        }
        if (open < n) {
            backTrack(open + 1, close, ans + "(", list, n);
        }
        if (close < open) {
            backTrack(open, close + 1, ans + ")", list, n);
        }
    }

    static List<String> generateParentheses(int n) {
        List<String> list = new ArrayList<>();
        backTrack(0, 0, "", list, n);
        return list;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParentheses(n));
    }

}
