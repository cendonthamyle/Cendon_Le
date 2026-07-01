package Programming.DailyPractices.June2026;

import java.util.Scanner; // Required for user input // Exercise 1

public class D300620226 {
    /*
     * Exercise 1 (Warm-up): Variables & Data Types
        | Scenario: Budget of $500. Spent $132.50 on groceries and $45.25 on streaming.
        | Task: Store values, calculate remaining balance, and cast to an integer.
    */
    public static class BudgetTracker {
        public static void main(String[] args) {
            // 1. Store the initial budget as an integer 
            int budget = 500;
        
            // 2. Store the two expenses as doubles 
            double spentGroceries = 132.50;
            double spentStreaming = 45.25;
        
            // 3. Calculate and print the remaining balance 
            double remainingBalance = budget - (spentGroceries + spentStreaming);

            System.out.println("The inicial budget was $" + remainingBalance);
            System.out.println("The remaining budget is $" + remainingBalance);
        
            // 4. Cast the remaining balance to a whole integer and print it 
            int finalRemainingBalance = (int) remainingBalance;

            System.out.println("Your rounded remaining balance is $" + finalRemainingBalance);
        }
    }

    /*
     * Exercise 2 (Intermediate): Control Flow & Leap Year Logic
        | Scenario: Determine if a specific year is a leap year.
        | Rules: Divisible by 4, EXCEPT if divisible by 100, UNLESS also divisible by 400.
     */
    public static class LeapYearChecker {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Write a year: ");
            int year = scanner.nextInt();

            isLeapYear(year);

            scanner.close(); 
        }

        public static void isLeapYear(int year) {
            // Write your nested if-else statements or logical operators here 
           if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                System.out.println(year + " is a Leap Year");
           }
        }
    }

    /*
     * Exercise 3 (Advanced): Loops & Modulo 
       | Task: Iterate numbers from 1 to 50.
        | Multiple of 3 -> "Fizz" 
        | Multiple of 5 -> "Buzz" 
        | Multiple of both -> "FizzBuzz" 
        | Otherwise -> Print the number 
    */
    public static class FizzBuzz {
        public static void main(String[] args) {
            // Write your for loop and remainder (%) logic here 
            for (int i = 1; i <= 50; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
    }

    /*
     * Exercise 4 (Challenge): While Loops & Input 
       | Scenario: Hardcode a secret number and have the user guess it.
       | Feedback: "Too high!", "Too low!", or "Correct!" (breaks the loop).
     */
    public static class GuessingGame {
        public static void main(String[] args) {
            int secret = 7; // The hidden number 
            Scanner scanner = new Scanner(System.in); 

            System.out.println("Write a guess: ");
            int guess = scanner.nextInt();

            // Write your while loop here 
            while (secret != guess){
                if (secret > guess) {
                    System.out.println("Too low!");
                } else if (secret < guess) {
                    System.out.println("Too high!");
                }
                System.out.print("Try again: ");
                guess = scanner.nextInt();
            } 
            System.out.println("Correct!");
        
            scanner.close(); // Clean up resource after use
        }
    }
}