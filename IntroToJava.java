public class IntroToJava {
    public static void main(String[] args) {
        // Introduction to Java Programming

        // Primitive types
        String myClass = "CS 2401"; // A string representing a class name
        int age = 21; // An integer representing a person's age

        float floatValue = 3.141592653589793238462643383279502884197f; // A single-precision floating-point number
        double doubleValue = 2.71828; // A double-precision floating-point number. By default, decimal literals are treated as doubles
        
        System.out.println("Float Value: " + floatValue);
        System.out.println("Double Value: " + doubleValue);

        char grade = 'A'; // A character representing a grade
        boolean isStudent = true; // A boolean indicating whether someone is a student
        
        // Explaining For Loops vs. While Loops
        /* 
         * For loops: 
         * Use a for loop when you know beforehand how many times you want to iterate.
         * It's particularly useful for iterating over a range of values, such as from start to end, with a fixed step size.
         * The loop variable is usually initialized, checked, and updated within the for statement itself.
         * Commonly used for iterating through arrays, lists, or sequences of known length.
         * 
         * While loops:
         * Use a while loop when you want to repeat a block of code based on a certain condition.
         * It's suitable when the number of iterations is not known in advance, or when you want to keep iterating until a specific condition is no longer met.
         * The loop condition is checked before each iteration, and if it evaluates to true, the loop continues.
         * It's important to ensure that the loop eventually terminates to prevent infinite loops.
         */

        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration " + i);
        }

        // While loop
        int count = 0;
        while (count < 3) {
            System.out.println("Count: " + count);
            count++;
        }

        // Working with Arrays

        // 1D Array
        int[] numbers = { 5, 10, 15, 20, 25 };


        // Method call to find the maximum element
        int maxNumber = findMax(numbers);
        System.out.println("Maximum number: " + maxNumber);

        // 2D Array
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };

        int[][] jaggedArray = {
            { 1, 2, 3 },
            { 4, 5 },
            { 6, 7, 8, 9 }
        };

        // Iterating through the 2D array using for loops
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Iterate through the jagged array
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println(); // Move to the next row
        }

        // Iterating through the 2D array using enhanced for loops
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        // Ternary Opperation
        int number = 7;
        
        // Using ternary operator to determine if the number is even or odd
        String parity = (number % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number " + number + " is " + parity + ".");

        // Analyzing Time Complexity

        // Time complexity analysis of a loop
        int n = 10;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum: " + sum);

        // The time complexity of the loop is O(n) since it runs 'n' times.

        // Using Methods

        // Array method
        int arraySize = 5;
        int[] myArray = createArray(arraySize);

        // Printing the elements of the returned array
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        number = 5;

        // Calculate factorial using recursion
        int factorialRecursiveResult = factorialRecursive(number);
        System.out.println("Factorial of " + number + " (using recursion): " + factorialRecursiveResult);

        // Calculate factorial without recursion
        int factorialIterativeResult = factorialIterative(number);
        System.out.println("Factorial of " + number + " (without recursion): " + factorialIterativeResult);
 
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = -100;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method that creates and returns a 1D array
    public static int[] createArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < size; i++) {
            newArray[i] = i + 1; // Filling the array with values
        }
        return newArray;
    }

    // Factorial using recursion
    public static int factorialRecursive(int n) {
        //State your base case
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    // Factorial without recursion
    public static int factorialIterative(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}