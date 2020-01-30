import java.util.Scanner;

public class SumAndAverage {
    public static void main(String [] args) {
        // Using Scanner object to get input
        Scanner input = new Scanner(System.in);

        // Prompting User to give input
        System.out.print("Enter an integer, the input ends if it's 0: ");

        // Initializing the variables taken
        int number, positive_counter, negative_counter;
        double counter;
        number = input.nextInt();
        positive_counter = 0;
        negative_counter = 0;
        counter = 1;
        double total = 0;


        // While loop for carrying out the required iterations
        while (number != 0) {
            number = input.nextInt();
            total = total + number;
            counter++;

            if (number >= 0) {
                positive_counter++;
            } else if (number < 0) {
                negative_counter++;
            }
        }

        double average =  total / counter;

        System.out.println("The number of positives is " + positive_counter);
        System.out.println("The number of negatives is  " + negative_counter);
        System.out.println("The total is  " + total);
        System.out.println("The average is " + average);
    }
}
