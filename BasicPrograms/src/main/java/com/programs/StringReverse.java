package com.programs;

public class StringReverse {

    static String reverseString(String str) {
        String[] temp = str.split(" ");
        String rev = "";
        for (int i = 0; i < temp.length; i++) {
            if (i == temp.length - 1) {
                rev = temp[i] + rev;
            } else rev = " " + temp[i] + rev;
        }
        return rev;
    }

    static String reverseWords(String str) {
        String[] temp = str.split(" ");
        String rev = "";
        for (String string : temp) {
            StringBuilder stringBuilder = new StringBuilder(string);
            rev += stringBuilder.reverse() + " ";
            rev.toString().trim();
        }
        return rev;
    }

    public static void main(String[] args) {
        String str = "welcome to java";
        System.out.println(reverseString(str));
        System.out.println(reverseWords(str));

    }
}
