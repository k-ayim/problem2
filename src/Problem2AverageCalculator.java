import java.util.Scanner;

public class Problem2AverageCalculator {
    
    /**
     * Calculates the average of elements in an array.
     * 
     * @param array The array of integers
     * @return The average of elements in the array
     * @throws IllegalArgumentException if the array is empty or null
     */
    public static double calculateAverage(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }
        
        int sum = 0; // Initialize sum to zero
        
        // Loop through the array to calculate the sum of elements
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        
        // Calculate the average
        double average = (double) sum / array.length;
        return average;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();
        
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        
        double average = calculateAverage(array);
        System.out.println("Average of elements in the array: " + average);
        
        scanner.close();
    }
}
