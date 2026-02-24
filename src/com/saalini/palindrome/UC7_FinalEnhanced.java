package com.saalini.palindrome;

import java.util.Scanner;

public class UC7_FinalEnhanced {

    // Reusable method
    public static boolean isPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    // UC7 execution
    public static void runFinalVersion() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word for UC7 Final Check: ");
        String input = sc.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a Palindrome (UC7 Final)");
        } else {
            System.out.println(input + " is NOT a Palindrome (UC7 Final)");
        }
    }
}