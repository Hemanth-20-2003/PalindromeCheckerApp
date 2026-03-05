package com.palindromechecker;

import java.util.Scanner;

/**
 * Use Case 11: Object-Oriented Palindrome Service
 *
 * Description:
 * This class demonstrates palindrome validation using object-oriented design.
 *
 * The palindrome logic is encapsulated inside a PalindromeService class.
 * This improves:
 * - Reusability
 * - Readability
 * - Separation of concerns
 *
 * @author Developer
 * @version 11.0
 */
public class UseCaseElevenPalindromeCheckerApp {

	/**
	 * Application entry point for UC11.
	 *
	 * @param args Command-line arguments
	 */
	public static void main(String[] args) {
		// Create an instance of PalindromeService
		PalindromeService service = new PalindromeService();

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String input = sc.nextLine();

		boolean result = service.checkPalindrome(input);

		// Print result to console
		System.out.println("Input: " + input +
				" | Palindrome? " + result);
	}
}

/**
 * Service class that contains palindrome logic.
 * Demonstrates the two-pointer approach for checking palindromes.
 */
class PalindromeService {

	/**
	 * Checks whether the input string is a palindrome.
	 *
	 * @param input Input string
	 * @return true if palindrome, false otherwise
	 */
	public boolean checkPalindrome(String input) {
		// Defensive check: handle null or empty strings
		if (input == null || input.isEmpty()) {
			return false;
		}
        input = input.toLowerCase().replaceAll("[^a-z0-9]", "");

		// Initialize pointers
		int start = 0;                     // Points to the first character
		int end = input.length() - 1;      // Points to the last character

		// Compare characters moving inward
		while (start < end) {
			// If mismatch found, it's not a palindrome
			if (input.charAt(start) != input.charAt(end)) {
				return false;
			}

			// Move pointers closer to the center
			start++;
			end--;
		}

		// If loop completes without mismatches, it's a palindrome
		return true;
	}
}
