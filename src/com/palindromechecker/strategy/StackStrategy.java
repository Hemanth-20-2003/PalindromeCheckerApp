package com.palindromechecker.strategy;

import java.util.Stack;

/**
 * StackStrategy
 * A strategy that uses a Stack to check for palindromes.
 * @author Developer
 * @version 1.0
 */
public class StackStrategy implements PalindromeStrategy {

    /**
     * Implements validation logic using a stack.
     * @param input The string to validate
     * @return true if the string is a palindrome, false otherwise
     */
    @Override
    public boolean palindromechecker(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        // Create a stack to store characters
        Stack<Character> stack = new Stack<>(); 
        
        // Push each character of the input string onto the stack
        for (char c : input.toCharArray()) { 
            stack.push(c);
        }
        
        // Compare characters by popping from the stack
        for (char c : input.toCharArray()) { 
            if (c != stack.pop()) {
                return false;
            }
        }
        return true;
    }
}