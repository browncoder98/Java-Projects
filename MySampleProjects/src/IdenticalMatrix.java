import java.util.Scanner;

public class IdenticalMatrix {


    // Method initializes a 3 x 3 array with user input */
    public static int[][] Display_Array() {
        Scanner input = new Scanner(System.in);
        int rows = 3;
        int columns = 3;
        int[][] Rakin = new int[rows][columns];
        for (int i = 0; i < Rakin.length; i++) {
            for (int j = 0; j < Rakin[i].length; j++) {
                Rakin[i][j] = input.nextInt();
            }
        }
        return Rakin;
    }


    // Method created to return an array initialized with matrix elements
    public static int[] MatrixToArray(int[][] m) {
        int[] list = new int[m.length * m[0].length];
        int k = 0;
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                list[k] = m[i][j];
                k++;
            }
        }
        return list;
    }

    // Method sorts each column in a 3 x 3 array in ascending order
    public static int[] Organize(int[][] m) {
        int [] list = MatrixToArray(m);
        for (int i = 0; i < 3; i++) {
            // Find the min in the column 1
            int min = list[i];
            int minIndex = i;

            for (int j = i + 1; j < 3; j++) {
                if (min > list[j]) {
                    min = list[j];
                    minIndex = j;
                }
            }

            // Swap
            if (minIndex != i) {
                list[minIndex] = list[i];
                list[i] = min;
            }
        }
        return list;
    }

    // Method  returns true if m1 and m2 are identical */
    public static boolean equals(int[][] m1, int[][] m2) {
        int[] list1 = Organize(m1);
        int[] list2 = Organize(m2);
        for (int i = 0; i < list1.length; i++) {
            if (list1[i] != list2[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Prompt the user to enter two 3 x 3 arrays
        System.out.print("Enter list1: ");
        int[][] first_array = Display_Array();
        System.out.print("Enter list2: ");
        int[][] second_array = Display_Array();

        // Displays whether the two lists are identical
        System.out.println("The two arrays are" +
                (equals(first_array, second_array) ? " " : " not ") + "identical");
    }
}

