package com.neetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NeetCode6 {

    public static String encode(List<String> strs) {
        int len = 0;

        StringBuilder stringBuilder = new StringBuilder("");
        for (String string : strs) {
            len = string.length();
            stringBuilder.append(len);
            stringBuilder.append("#");
            stringBuilder.append(string);
        }
        return stringBuilder.toString();

    }

    public static List<String> decode(String str) {
        char[] ch = str.toCharArray();
        int i = 0, j;
        List<String> list = new ArrayList<>();
        int len = 0;
        while (i < ch.length) {
            j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            len = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            list.add(str.substring(i, len + i));
            i += len ;
        }
        return list;
    }

    public static void main(String[] args) {
        List<String> list = Arrays.asList("wfffffffffffffffe", "sdfgsdgdfgdfsay", ":", "you");
        System.out.println(encode(list));
        System.out.println(decode(encode(list)));
    }
}
