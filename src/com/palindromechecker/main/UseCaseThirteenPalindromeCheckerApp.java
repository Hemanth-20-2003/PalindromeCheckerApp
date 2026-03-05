package com.palindromechecker.main;

import com.palindromechecker.strategy.DequeStrategy;
import com.palindromechecker.strategy.PalindromeStrategy;
import com.palindromechecker.strategy.StackStrategy;
import java.util.Scanner;

/**
 * UseCaseThirteenPalindromeCheckerApp
 * Compares execution time of two palindrome strategies.
 * @author Developer
 * @version 13.0
 */
public class UseCaseThirteenPalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String normalizedInput = input.toLowerCase();

        System.out.println("Input: " + input);

        // Strategy 1 : Stack
        PalindromeStrategy stackStrategy = new StackStrategy();

        long startTime1 = System.nanoTime();
        boolean stackResult = stackStrategy.palindromechecker(normalizedInput);
        long endTime1 = System.nanoTime();

        long stackExecutionTime = endTime1 - startTime1;

        System.out.println("\n--- Stack Strategy ---");
        System.out.println("Is Palindrome? " + stackResult);
        System.out.println("Execution Time: " + stackExecutionTime + " ns");


        // Strategy 2 : Deque
        PalindromeStrategy dequeStrategy = new DequeStrategy();

        long startTime2 = System.nanoTime();
        boolean dequeResult = dequeStrategy.palindromechecker(normalizedInput);
        long endTime2 = System.nanoTime();

        long dequeExecutionTime = endTime2 - startTime2;

        System.out.println("\n--- Deque Strategy ---");
        System.out.println("Is Palindrome? " + dequeResult);
        System.out.println("Execution Time: " + dequeExecutionTime + " ns");
    }
}