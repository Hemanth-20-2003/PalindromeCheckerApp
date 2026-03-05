package com.palindromechecker;

import java.util.Scanner;

/**
 * Use Case 10: Normalized Palindrome Validation
 *
 * Description:
 * This class validates a palindrome after preprocessing
 * the input string.
 *
 * Normalization includes:
 * - Removing spaces and symbols
 * - Converting to lowercase
 *
 * This ensures the palindrome check is logical rather
 * than character-format dependent.
 *
 * Example:
 * "A man a plan a canal Panama"
 *
 * @author Developer
 * @version 10.0
 */
public class UseCaseTenPalindromeCheckerApp {

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

        // Step 1: Normalize the string
        // - Convert to lowercase
        // - Remove all non-alphanumeric characters (spaces, punctuation, symbols)
        String normalized = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        // Step 2: Flag to track palindrome status
        boolean isPalindrome = true;

        // Step 3: Compare characters from both ends
        for (int i = 0; i < normalized.length() / 2; i++) {
            // Compare symmetric characters
            if (normalized.charAt(i) != normalized.charAt(normalized.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        
    }
}
