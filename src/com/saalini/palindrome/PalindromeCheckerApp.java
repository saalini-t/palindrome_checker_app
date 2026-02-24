package com.saalini.palindrome;

import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : word.toCharArray()){
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while(deque.size() > 1){
            if(deque.removeFirst() != deque.removeLast()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is Palindrome (UC7)");
        }else{
            System.out.println(word + " is NOT Palindrome (UC7)");
        }
    }
}