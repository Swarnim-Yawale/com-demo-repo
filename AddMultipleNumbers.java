/**
 * Java program to add multiple numbers
 * This program demonstrates different methods to sum multiple numbers
 */

public class AddMultipleNumbers {

    /**
     * Method 1: Add numbers using variable arguments (varargs)
     * @param numbers - variable number of integers to add
     * @return sum of all numbers
     */
    public static int addNumbers(int... numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Method 2: Add numbers from an array
     * @param numbers - array of integers to add
     * @return sum of all numbers in the array
     */
    public static int addArray(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    /**
     * Method 3: Add numbers using streams (Java 8+)
     * @param numbers - variable number of integers to add
     * @return sum of all numbers
     */
    public static int addNumbersStream(int... numbers) {
        return java.util.Arrays.stream(numbers).sum();
    }

    /**
     * Main method to demonstrate the different approaches
     */
    public static void main(String[] args) {
        System.out.println("=== Java Program to Add Multiple Numbers ===\n");

        // Method 1: Using varargs
        System.out.println("Method 1: Using variable arguments (varargs)");
        int result1 = addNumbers(10, 20, 30, 40, 50);
        System.out.println("Sum of 10 + 20 + 30 + 40 + 50 = " + result1);

        int result2 = addNumbers(5, 15, 25);
        System.out.println("Sum of 5 + 15 + 25 = " + result2);

        // Method 2: Using array
        System.out.println("\nMethod 2: Using array");
        int[] numbers = {100, 200, 300, 400};
        int result3 = addArray(numbers);
        System.out.println("Sum of array [100, 200, 300, 400] = " + result3);

        // Method 3: Using streams
        System.out.println("\nMethod 3: Using streams");
        int result4 = addNumbersStream(12, 24, 36, 48);
        System.out.println("Sum of 12 + 24 + 36 + 48 = " + result4);

        // Interactive example: Adding numbers from user input
        System.out.println("\n--- Adding numbers from user input ---");
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("How many numbers do you want to add? ");
        
        try {
            int count = scanner.nextInt();
            int[] userNumbers = new int[count];
            
            System.out.println("Enter " + count + " numbers:");
            for (int i = 0; i < count; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                userNumbers[i] = scanner.nextInt();
            }
            
            int userSum = addArray(userNumbers);
            System.out.println("Sum of all entered numbers = " + userSum);
        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input! Please enter valid integers.");
        } finally {
            scanner.close();
        }
    }
}
