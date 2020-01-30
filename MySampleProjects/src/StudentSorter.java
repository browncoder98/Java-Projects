import java.util.Scanner;

public class StudentSorter {
    // Method sorts a string and integer array in decreasing order */
    public static void DecreasingOrder(String[] Rakin, int[] Riza) {
        for (int i = 0; i < Riza.length; i++) {
            int max = Riza[i];
            int maxIndex = i;
            String temp;

            // Finds the minimum in the list
            for (int j = i + 1; j < Riza.length; j++) {
                if (Riza[j] > max) {
                    max = Riza[j];
                    maxIndex = j;
                }
            }

            if (maxIndex != i) {
                // Swap string array
                temp = Rakin[i];
                Rakin[i] = Rakin[maxIndex];
                Rakin[maxIndex] = temp;

                // Swap int array
               Rakin[maxIndex] = Rakin[i];
                Riza[i] = max;
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompts the user to enter the number of students
        System.out.print("Enter the number of students: ");
        String[] students = new String[input.nextInt()];
        int[] scores = new int[students.length];

        // Prompts the user to enter each students' names and their scores
        System.out.println("Enter the name a score for each student:");
        for (int i = 0; i < students.length; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            students[i] = input.next();
            System.out.print("Score: ");
            scores[i] = input.nextInt();
        }

        // Sort student names in decreasing order of their scores
        DecreasingOrder(students, scores);

        // Displays student name in decreasing order of their scores.
        // Enhanced "for loop"
        for (String e: students) {
            System.out.println(e);
        }
    }
}

