import java.util.Scanner;


public class ComputeInterest {
    public static void main(String[]args) {
        double Interest, Principal, Rate, Time; // Declaring all the required variables




        // Creating Scanner to take input
        Scanner input = new Scanner(System.in);
        //Input and Output for the Principal Amount
        System.out.print("Enter the initial deposit amount: ");
        Principal = input.nextDouble();
        //Input and Output for the rate
        System.out.print("Enter annual percentage yield: ");
        Rate = input.nextDouble();
        //Input and Output for the number of months
        System.out.print("Enter maturity period (the number of months): ");
        Time = input.nextDouble();

        // Creating the heading of the table
        System.out.println("Month\t\t\tCD Value");


        // Using for loop and formula to calculate the desired results
        for (int i = 1; i <= Time; i++) {

            Interest = Principal *(Rate/1200);

            Principal = Principal + Interest;

            System.out.printf("%-7d\t\t\t%.2f\n", i, Principal); // Converting output to two decimal places
        }
    }

}

