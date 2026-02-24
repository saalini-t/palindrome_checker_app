package com.saalini.palindrome;

import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter word: ");
        String word = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(char c : word.toCharArray()){
            stack.push(c);
        }

        boolean isPalindrome = true;

        for(int i=0;i<word.length();i++){
            if(word.charAt(i) != stack.pop()){
                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome){
            System.out.println(word + " is Palindrome (UC5)");
        }else{
            System.out.println(word + " is NOT Palindrome (UC5)");
        }
    }
}