package com.programs;

public class IntegerToRoman {

    static void getRoman(int val) {
        if (val >= 1000) {
            System.out.print("M");
            getRoman(val - 1000);
        } else if (val >= 900) {
            System.out.print("CM");
            getRoman(val - 900);
        } else if (val >= 500) {
            System.out.print("D");
            getRoman(val - 500);
        } else if (val >= 400) {
            System.out.print("CD");
            getRoman(val - 400);
        } else if (val >= 100) {
            System.out.print("C");
            getRoman(val - 100);
        } else if (val >= 90) {
            System.out.print("XC");
            getRoman(val - 90);
        } else if (val >= 50) {
            System.out.print("L");
            getRoman(val - 50);
        } else if (val >= 40) {
            System.out.print("XL");
            getRoman(val - 40);
        } else if (val >= 10) {
            System.out.print("X");
            getRoman(val - 10);
        } else if (val >= 9) {
            System.out.print("IX");
            getRoman(val - 9);
        } else if (val >= 5) {
            System.out.print("V");
            getRoman(val - 5);
        } else if (val >= 4) {
            System.out.print("IV");
            getRoman(val - 4);
        } else if (val >= 1) {
            System.out.print("I");
            getRoman(val - 1);
        }
    }

    public static void main(String[] args) {
        getRoman(1100);
    }
}
