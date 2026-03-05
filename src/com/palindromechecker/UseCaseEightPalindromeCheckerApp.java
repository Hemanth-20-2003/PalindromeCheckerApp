package com.palindromechecker;
/**
 * ================================================================
 * MAIN CLASS - UseCase8PalindromeCheckerApp
 * ================================================================
 *
 * Use Case 8: Linked List Based Palindrome Checker
 *
 * Description:
 * This class checks whether a string is a palindrome
 * using a LinkedList.
 *
 * Characters are added to the list and then compared
 * by removing elements from both ends:
 *
 * - removeFirst()
 * - removeLast()
 *
 * This demonstrates how LinkedList supports
 * double-ended operations for symmetric validation.
 *
 * @author Developer
 * @version 8.0
 */
import java.util.LinkedList;
import java.util.Scanner;

public class UseCaseEightPalindromeCheckerApp {

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

        // LinkedList to store characters of the string
        LinkedList<Character> list = new LinkedList<>();

        // Add each character from the string into the LinkedList
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters from both ends until the list shrinks
        while (list.size() > 1) {
            // Remove first and last characters
            char first = list.removeFirst();
            char last = list.removeLast();

            // If mismatch found, it's not a palindrome
            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("Is Palindrome? : " + isPalindrome);
        
    }
}
