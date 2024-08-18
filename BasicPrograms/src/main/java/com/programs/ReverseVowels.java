package com.programs;

public class ReverseVowels {

    static boolean isVowel(char ch) {
        return (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' || ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' || ch == 'u' | ch == 'U');
    }

    static void reverseVowels(String string) {
        char[] c = string.toCharArray();
        int left = 0;
        int right = c.length - 1;
        while (left < right) {

            if (!isVowel(string.charAt(left))) {
                left++;
                continue;
            }
            if (!isVowel(string.charAt(right))) {
                right--;
                continue;
            }
            char ch = c[left];
            c[left] = c[right];
            c[right] = ch;
            left++;
            right--;
        }
        System.out.println(c);
    }

    public static void main(String[] args) {
        String str = "hello";
        reverseVowels(str);
    }
}
