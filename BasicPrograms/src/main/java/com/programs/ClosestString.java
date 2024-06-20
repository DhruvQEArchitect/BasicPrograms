package com.programs;

public class ClosestString {

    public static void main(String[] args) {
        String[] s = {"the", "quick", "brown", "fox", "quick", "fosx", "test", "fox", "fosx"};
        String word1 = "the";
        String word2 = "fosx";
        int d1 = -1;
        int d2 = -1;
        int distance = Integer.MAX_VALUE;
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals(word1)) {
                d1 = i;
            }
            if (s[i].equals(word2)) {
                d2 = i;
            }
            if (d1 != -1 && d2 != -1) {
                distance = Math.min(distance, Math.abs(d2 - d1));
            }
        }
        System.out.println(distance);
    }
}
