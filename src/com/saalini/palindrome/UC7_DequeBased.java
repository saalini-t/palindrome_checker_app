package com.saalini.palindrome;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class UC7_DequeBased {

    public static void checkDequePalindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word for UC7 Deque Check: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front & rear
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (UC7)");
        } else {
            System.out.println(input + " is NOT a Palindrome (UC7)");
        }
    }
}