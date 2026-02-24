package com.saalini.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class UC5_IgnoreSpaces {

    public static void checkStackPalindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word for UC5 check: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Pop and compare
        for (int i = 0; i < input.length(); i++) {
            char ch = stack.pop();
            if (input.charAt(i) != ch) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (UC5)");
        } else {
            System.out.println(input + " is NOT a Palindrome (UC5)");
        }
    }
}