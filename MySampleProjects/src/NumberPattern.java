import java.util.Scanner; // Importing the library for the Scanner

public class NumberPattern {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // Creates a Scanner

        // Input for the number of rows
        System.out.print("Enter the number of rows: ");
        int rows = input.nextInt();

        // Calling the method "displayPattern"
        displayPattern(rows);
    }

   // Method for displaying the desired pattern using parameter n
    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) { // i is the counter variable for rows
            for (int k = n-1; k>=i; k--){ // k is the counter variable for creating spaces
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {// j is the counter for creating columns
            System.out.print(j+" ");
        }

            System.out.println(); // Helps move to the next line
        }


    }
}
