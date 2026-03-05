package com.palindromechecker;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

/**
 * Use Case 6: Queue + Stack Fairness Check
 *
 * Description:
 * This program demonstrates palindrome validation using
 * two different data structures:
 *
 * - Queue (FIFO – First In First Out)
 * - Stack (LIFO – Last In First Out)
 *
 * Characters from the input string are inserted into both structures. Then they are compared by removing characters from the front of the queue and the top of the stack.
 *
 * If all characters match, the string is confirmed as a palindrome.
 *
 * This example helps understand how FIFO and LIFO behaviors can be combined for symmetric comparison.
 *
 * @author Developer
 * @version 6.0
 */

public class UseCaseSixPalindromeCheckerApp {

    /**
     * Application entry point for UC6
     * @param args Command line arguments
     */
    public static void main(String[] args) {

    	Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toUpperCase();
        
        // Create a Queue to store characters in FIFO order
        Queue<Character> queue = new LinkedList<>();

        // Create a Stack to store characters in LIFO order
        Stack<Character> stack = new Stack<>();

        // Insert each character into both queue and stack
        for (char c : input.toCharArray()) {
            queue.add(c);   // FIFO insertion
            stack.push(c);  // LIFO insertion
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters until the queue becomes empty
        while (!queue.isEmpty()) {

            // Remove from front of queue
            char fromQueue = queue.poll();

            // Remove from top of stack
            char fromStack = stack.pop();

            // Compare both characters
            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Print result
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}