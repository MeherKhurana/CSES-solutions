import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read n
        int n = scanner.nextInt();
        
        // Calculate the sum of the first n natural numbers
        long totalSum = (long)n * (n + 1) / 2;
        
        // Read the n-1 numbers and calculate their sum
        long sumOfInputNumbers = 0;
        for (int i = 0; i < n - 1; i++) {
            sumOfInputNumbers += scanner.nextInt();
        }
        
        // The missing number is the difference between the totalSum and sumOfInputNumbers
        long missingNumber = totalSum - sumOfInputNumbers;
        
        // Print the missing number
        System.out.println(missingNumber);
        
        // Close the scanner
        scanner.close();
    }
}