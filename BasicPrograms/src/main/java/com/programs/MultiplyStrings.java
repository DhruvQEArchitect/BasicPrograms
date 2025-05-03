package com.programs;

public class MultiplyStrings {

    static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0"))
            return "0";
        int n1 = num1.length(), n2 = num2.length();
        int[] res = new int[n1 + n2];

        int i = n2 - 1;
        int pf = 0;

        while (i >= 0) {
            int iVal = num2.charAt(i) - '0';
            i--;

            int j = n1 - 1;
            int k = res.length - 1 - pf;
            int carry = 0;
            while (j >= 0 || carry != 0) {
                int jVal = j >= 0 ? num1.charAt(j) - '0' : 0;
                j--;
                int product = iVal * jVal + carry + res[k];
                res[k] = product % 10;
                carry = product / 10;
                k--;
            }
            pf++;
        }
        boolean flag = false;
        String ans = "";
        for (int val : res) {
            if (val == 0 && flag == false) {
                continue;
            } else {
                flag = true;
                ans += val;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(multiply("9", "99"));
    }
}
