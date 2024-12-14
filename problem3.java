import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer (a): ");
        int a = scanner.nextInt();
        scanner.close();

        System.out.println("Output:");
        printOddSequence(getNumTerms(a)); // Get the number of terms based on 'a'
    }

    
    public static int getNumTerms(int a) {
        if (a < 3) {
            return 1; // 'a' is 1 or 2, return 1 term
        } else {
            return (a % 2 == 1) ? a : (a - 1); 
        }
    }

  
    public static void printOddSequence(int numTerms) {
        int oddNum = 1; 
        for (int i = 1; i <= numTerms; i++) {
            System.out.print(oddNum);
            if (i < numTerms) {
                System.out.print(", "); 
            }
            oddNum += 2; // Increment to the next odd number
        }
        System.out.println();
    }
}
