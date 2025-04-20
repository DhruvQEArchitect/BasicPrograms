package com.programs;

public class MaxRepeatingSubstring {

    static int maxRepeating(String sequence, String word) {
        int count = 0;
        String newAns = word;
        while (sequence.contains(newAns)) {
            newAns += word;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxRepeating("ababc", "ab"));
    }
}
