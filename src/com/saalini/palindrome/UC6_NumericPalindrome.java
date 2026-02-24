package com.saalini.palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class UC6_NumericPalindrome {

    public static void checkQueueStackPalindrome() {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word for UC6 check: ");
        String input = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);   // FIFO
            stack.push(ch);  // LIFO
        }

        boolean isPalindrome = true;

        // Compare dequeue vs pop
        while (!queue.isEmpty()) {

            char qChar = queue.remove(); // dequeue
            char sChar = stack.pop();    // pop

            if (qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome (UC6)");
        } else {
            System.out.println(input + " is NOT a Palindrome (UC6)");
        }
    }
}