package com.palindromechecker.strategy;

/**
 * PalindromeStrategy
 * An interface that defines how any palindrome checker should work.
 * All strategies must follow this rule.
 * @author Developer
 * @version 1.0
 */
public interface PalindromeStrategy {
    
    /**
     * Validates if the input string is a palindrome.
     * @param input The string to validate
     * @return true if the string is a palindrome, false otherwise
     */
    boolean palindromechecker(String input);
}