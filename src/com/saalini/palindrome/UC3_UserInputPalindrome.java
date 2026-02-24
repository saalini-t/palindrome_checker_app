package com.saalini.palindrome;

import java.util.Scanner;

public class UC3_UserInputPalindrome {

    public static void checkUserInputPalindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String original = sc.nextLine();

        String reversed = "";

        // Reverse using for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Compare original and reversed
        if (original.equals(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is NOT a Palindrome");
        }
    }
}