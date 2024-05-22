package com.programs;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {

    static boolean isBalanced(String str) {
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                deque.push(str.charAt(i));
                continue;
            }

            if (deque.isEmpty())
                return false;
            char check;
            switch (str.charAt(i)) {
                case '}':
                    check = deque.pop();
                    if (check == ')' || check == ']')
                        return false;
                    break;
                case ')':
                    check = deque.pop();
                    if (check == '}' || check == ']')
                        return false;
                    break;
                case ']':
                    check = deque.pop();
                    if (check == ')' || check == '}')
                        return false;
                    break;
            }
        }
        return deque.isEmpty();
    }

    public static void main(String[] args) {
//        String str = "[({}]";
        String str = "[({})]";
        System.out.println(isBalanced(str));
    }
}
