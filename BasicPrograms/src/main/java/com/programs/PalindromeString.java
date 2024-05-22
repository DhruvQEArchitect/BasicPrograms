package com.programs;

public class PalindromeString {

    static boolean isPalindrome(String str) {
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.toLowerCase().charAt(i) != str
                    .toLowerCase().charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        String string = "Radar";
        System.out.println(isPalindrome(string));

    }
}
