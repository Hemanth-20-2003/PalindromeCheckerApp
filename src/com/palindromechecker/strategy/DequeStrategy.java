package com.palindromechecker.strategy;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * DequeStrategy
 * A strategy that uses a Deque (Double-Ended Queue) to check for palindromes.
 * @author Developer
 * @version 1.0
 */
public class DequeStrategy implements PalindromeStrategy {

    /**
     * Implements validation logic using a deque.
     * @param input The string to validate
     * @return true if the string is a palindrome, false otherwise
     */
    @Override
    public boolean palindromechecker(String input) {
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        Deque<Character> deque = new ArrayDeque<>();
        
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }
        
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
}