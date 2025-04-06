package com.neetcode;

//Valid Palindrome

public class NeetCode10 {

    public static boolean isPalindrome(String s) {
        String newString = s.toLowerCase().replaceAll("[[^0-9]&&[^a-z]&&[^A-Z]]", "");
        char[] ch = newString.toCharArray();
        int left = 0, right = ch.length - 1;
        while (left < right) {
            if (ch[left] == ch[right]) {
                left++;
                right--;
            } else
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String s = "Was it a car or a cat I saw?";
        System.out.println(isPalindrome(s));
    }
}
