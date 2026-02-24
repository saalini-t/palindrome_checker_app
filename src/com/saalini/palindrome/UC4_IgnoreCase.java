package com.saalini.palindrome;

import java.util.Scanner;

public class UC4_IgnoreCase {

    public static void checkCharArrayPalindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word for UC4 check: ");
        String input = sc.nextLine();

        // Convert string to character array
        char[] arr = input.toCharArray();

        int start = 0;
        int end = arr.length - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while (start < end) {
            if (arr[start] != arr[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (UC4)");
        } else {
            System.out.println(input + " is NOT a Palindrome (UC4)");
        }
    }
}