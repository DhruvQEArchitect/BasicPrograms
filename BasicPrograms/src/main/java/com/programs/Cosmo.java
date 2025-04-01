package com.programs;

public class Cosmo {

    /**
     * Given a string, you need to return a new string where every letter is shifted to its right by one place in alphabetical order. The last letters z and Z should be replaced with the first ones: a and A, respectively. If the character isn't a letter, it should stay the same.
     * <p>
     * It is not allowed to use string built-in methods here.
     * <p>
     * For example, given the string "abc123XYz!", the function should return "bcd123YZa!".
     *
     * @param s
     * @return
     */
    public static String shiftByOneCharacter(String s) {
        StringBuilder stringBuilder = new StringBuilder("");
        char[] ch = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (isCharacter(ch[i]) && ch[i] == 'z') {
                ch[i] = 'a';
                stringBuilder.append(ch[i]);
            } else if (isCharacter(ch[i]) && ch[i] == 'Z') {
                ch[i] = 'A';
                stringBuilder.append(ch[i]);
            } else if (isDigit(ch[i])) stringBuilder.append(ch[i]);
            else if (!isDigit(ch[i]) && !isCharacter(ch[i])) stringBuilder.append(ch[i]);
            else stringBuilder.append(++ch[i]);
        }
        return stringBuilder.toString().trim();
    }

    public static boolean isCharacter(char ch) {
        if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
            return true;
        }
        return false;
    }

    public static boolean isDigit(char ch) {
        return (ch >= 48 && ch <= 57);
    }

    public static void main(String[] args) {

        System.out.println(shiftByOneCharacter("abc123XYz!"));

    }
}
