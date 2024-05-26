package com.programs;

public class LeapYear {

    public static boolean isLeap(int year) {
        boolean leap = true;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    leap = true;
                } else
                    leap = false;
            } else
                leap = true;
        } else
            leap = false;
        return leap;
    }

    public static void main(String[] args) {
        System.out.println(isLeap(1900));
        System.out.println(isLeap(2004));
    }
}
