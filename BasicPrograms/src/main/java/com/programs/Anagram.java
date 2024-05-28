package com.programs;

public class Anagram {

    static boolean isAnagram(String string1, String string2) {
        int[] arr = new int[26];
        if (string1.length() == string2.length()) {
            for (int i = 0; i < string1.length(); i++) {
                arr[string1.charAt(i) - 'a']++;
                arr[string2.charAt(i) - 'a']--;
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] != 0) {
                    return false;
                }
            }
            return true;
        } else
            return false;
    }

    public static void main(String[] args) {
//        String string1 = "heart";
//        String string2 = "earth";
        String string1 = "heart";
        String string2 = "eartt";
        System.out.println(isAnagram(string1, string2));
    }
}
