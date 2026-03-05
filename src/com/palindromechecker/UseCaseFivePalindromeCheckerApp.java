package com.palindromechecker;
/**
 * ================================================================
 * MAIN CLASS - PalindromeChecker
 * ================================================================
 *
 * Use Case 5: Stack Based Palindrome Checker
 *
 * Description:
 * This program validates whether a given string is a palindrome.
 * It uses a Stack data structure (LIFO principle).
 *
 * Steps:
 * - Take input string from user
 * - Push each character into a stack
 * - Pop characters in reverse order
 * - Compare with original sequence
 * - Display the result
 *
 * This maps stack behavior to reversal logic.
 *
 * @author Developer
 * @version 5.0
 */
import java.util.Scanner;
import java.util.Stack;

public class UseCaseFivePalindromeCheckerApp {

    /**
     * Application entry point.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {
        // Read input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toUpperCase();

        // Create a Stack to store characters
        Stack<Character> stack = new Stack<>();

        // Push each character of the string into the stack
        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        // Assume palindrome initially
        boolean isPalindrome = true;

        // Iterate again through original string
        for (char c : input.toCharArray()) {
            // Compare with popped character from stack (reverse order)
            if (c != stack.pop()) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);

        sc.close();
    }
}
