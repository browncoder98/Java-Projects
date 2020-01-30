import javax.swing.JOptionPane; // Importing the library for JOptionPane

public class PalindromeInteger {

    // public static variables declared so that it can be accessed by all the declared methods when needed

    public static int Reverse_Number, Remainder;
    public static int Final_Output;



    public static void main(String[] args) {
        // Input and Output taken via JOptionPane

        int input = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter the number you want to reverse: ")
        );

        JOptionPane.showMessageDialog(null, "The reversed number is " + reverse(input));

        // Conditional statements for boolean to return true or false

        if (isPalindrome(input)) {
            JOptionPane.showMessageDialog(null, "The number " + input + " is a Palindrome");
        }
        else {
            JOptionPane.showMessageDialog(null, "The number " + input + " is not a Palindrome");
        }
    }

    // Reverse function created to find out the reverse of the integer/input
    public static int reverse(int number) {

        Final_Output = number;

        // while loop used to separate the number into individual integers

        while (number > 0) {
            Remainder = number % 10;
            number = number / 10;
            Reverse_Number = Reverse_Number * 10 + Remainder;

        }
        return Reverse_Number;
    }

    // Function created to determine whether the number is a boolean or not

    public static boolean isPalindrome(int number) {

       number = Reverse_Number;

        if(Final_Output == number){
            return true;
        }
        else{
            return false;
        }
    }
}

