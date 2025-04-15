package com.programs;

public class RemoveAllAdjacentDuplicatesInString {

    static String removeDuplicates(String s) {

        StringBuilder newString = new StringBuilder("");
        int newStringLength = 0;

        for (char c : s.toCharArray()) {
            newStringLength = newString.length();
            if (newStringLength > 0 && newString.charAt(newStringLength - 1) == c) {
                newString.deleteCharAt(newStringLength - 1);
            } else {
                newString.append(c);
            }
        }
        return newString.toString();
    }


    public static void main(String[] args) {
        System.out.println(removeDuplicates("abbbabaaa"));
    }
}
