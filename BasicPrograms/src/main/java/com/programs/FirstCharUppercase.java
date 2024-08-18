package com.programs;

public class FirstCharUppercase {

    static String firstCharUppercase(String string) {
        String[] temp = string.split(" ");
        StringBuilder stringBuilder = new StringBuilder("");
        for (int i = 0; i < temp.length; i++) {
            stringBuilder.append(temp[i].substring(0, 1).toUpperCase() + temp[i].substring(1, temp[i].length()) + " ");
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "welcome to java";
        System.out.println(firstCharUppercase(str));
    }
}
