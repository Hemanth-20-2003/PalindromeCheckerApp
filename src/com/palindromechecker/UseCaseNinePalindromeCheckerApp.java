package com.palindromechecker;

import java.util.Scanner;

/**
 * ================================================================
 * MAIN CLASS - UseCase9PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 9: Recursive Palindrome Checker
 *
 * Description:
 * This class validates a palindrome using recursion.
 *
 * Characters are compared from the outer positions
 * moving inward using recursive calls.
 *
 * The recursion stops when:
 * - All characters are matched, or
 * - A mismatch is found.
 *
 * This use case demonstrates divide-and-conquer
 * logic using method recursion.
 *
 * @author Developer
 * @version 9.0
 */
public class UseCaseNinePalindromeCheckerApp {

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

        // Call recursive method to check palindrome
        boolean result = check(input, 0, input.length() - 1);


        System.out.println("Is Palindrome? : " + result);
    }

    /**
     * Recursively checks whether a string is palindrome.
     *
     * @param s Input string
     * @param start Starting index (left side)
     * @param end Ending index (right side)
     * @return true if palindrome, otherwise false
     */
    private static boolean check(String s, int start, int end) {
        // Base case 1: If start >= end, all characters matched
        if (start >= end) {
            return true;
        }

        // Base case 2: If mismatch found, return false
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        // Recursive case: Move inward
        return check(s, start + 1, end - 1);
    }
}
