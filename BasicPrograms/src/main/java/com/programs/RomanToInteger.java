package com.programs;

public class RomanToInteger {

    static int romanValue(char ch) {
        if (ch == 'I')
            return 1;
        else if (ch == 'V')
            return 5;
        else if (ch == 'X')
            return 10;
        else if (ch == 'L')
            return 50;
        else if (ch == 'C')
            return 100;
        else if (ch == 'D')
            return 500;
        else if (ch == 'M')
            return 1000;
        return -1;

    }

    static int getIntegerValueFromRoman(String str) {
        char[] ch = str.toCharArray();
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int s1 = romanValue(ch[i]);
            if (i + 1 < str.length()) {
                int s2 = romanValue(ch[i + 1]);
                if (s1 >= s2) {
                    result = result + s1;
                } else {
                    result = result + s2 - s1;
                    i++;
                }
            } else {
                result = result + s1;
            }
        }
        return result;
    }

    public static void main(String[] args) {

        String roman = "MCX";
        System.out.println(getIntegerValueFromRoman(roman));

    }
}
