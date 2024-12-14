import java.util.Scanner;

public class GenerateNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (a): ");
        int a = scanner.nextInt();
        scanner.close();

        System.out.println("Output:"); // Added a print statement to label the output
        printOddSequence(a); // Call the method to print the odd sequence
    }

    
    public static void printOddSequence(int a) {
        int oddNum = 1; // Initialize the first odd number
        for (int i = 1; i <= a; i++) {
            System.out.print(oddNum); // Print the current odd number
            if (i < a) {
                System.out.print(", "); // Add a comma separator if not the last number
            }
            oddNum += 2; // Increment to the next odd number
        }
    }
}
