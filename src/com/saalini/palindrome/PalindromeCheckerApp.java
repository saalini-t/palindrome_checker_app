package com.saalini.palindrome;

import java.util.*;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            queue.add(c);
            stack.push(c);
        }

        boolean isPalindrome = true;

        while(!queue.isEmpty()){
            if(queue.remove() != stack.pop()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is Palindrome (UC6)");
        }else{
            System.out.println(word + " is NOT Palindrome (UC6)");
        }
    }
}