package com.programs;

import java.util.StringTokenizer;

public class ValidateIPAddress {

    static boolean isValidIP(String str) {
        int size = str.length();
        if (size < 7)
            return false;

        StringTokenizer stringTokenizer = new StringTokenizer(str, ".");
        int count = 0;
        while (stringTokenizer.hasMoreTokens()) {
            String newIP = stringTokenizer.nextToken();
            count++;
            if (newIP.length() > 1 && newIP.charAt(0) == '0')
                return false;
            for (int i = 0; i < newIP.length(); i++) {
                if (!Character.isDigit(newIP.charAt(i)))
                    return false;

            }
            if (Integer.parseInt(newIP) > 255)
                return false;

        }
        if (count > 4)
            return false;
        return true;
    }

    public static void main(String[] args) {
        String s1 = "128.0.0.1";
        String s2 = "125.16.100.1";
        String s3 = "125.512.100.1";
        String s4 = "125.512.100.abc";

        System.out.println(isValidIP(s1) ? "Valid" : "Not valid");
        System.out.println(isValidIP(s2) ? "Valid" : "Not valid");
        System.out.println(isValidIP(s3) ? "Valid" : "Not valid");
        System.out.println(isValidIP(s4) ? "Valid" : "Not valid");
    }
}
