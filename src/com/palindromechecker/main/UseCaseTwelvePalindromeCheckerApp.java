package com.palindromechecker.main;

import com.palindromechecker.strategy.DequeStrategy;
import com.palindromechecker.strategy.PalindromeStrategy;
import com.palindromechecker.strategy.StackStrategy;
import java.util.Scanner;

/**
 * UseCaseTwelvePalindromeCheckerApp
 * Allows the user to choose which strategy (Stack or Deque) to use. Checks for palindromes based on the selected method.
 * @author Developer
 * @version 12.0
 */
public class UseCaseTwelvePalindromeCheckerApp {

    /**
     * The main method to run the check.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string to check: ");
        String input = scanner.nextLine();
        
        System.out.println("Select a Validation Strategy:");
        System.out.println("1. Stack-Based (LIFO)");
        System.out.println("2. Deque-Based (Front-and-Rear)");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();
        
        // Choose the strategy based on user input
        PalindromeStrategy strategy = switch (choice) {
            case 2 -> {
                yield new DequeStrategy();
            }
            default -> {
                yield new StackStrategy();
            }
        };
        // Run the check using the chosen strategy
        boolean isPalindrome = strategy.palindromechecker(input);
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome : " + isPalindrome);
   
    }
}