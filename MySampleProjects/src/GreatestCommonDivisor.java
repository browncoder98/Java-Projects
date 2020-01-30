import javax.swing.JOptionPane;

public class GreatestCommonDivisor {
    public static void main(String[]args){
        int num1 = Integer.parseInt( // First variable for input declared and parsed to integer
            JOptionPane.showInputDialog(null, "Enter the first number: ")
        );
        int num2 = Integer.parseInt( // Second variable for input declared and parse to integer
            JOptionPane.showInputDialog(null, "Enter the second number: ")
        );

        int divisor; // Divisor variable declared for obtaining GCD (Greatest Common Divisor)

        // Conditional Statements followed by loops

        if (num1 > num2){
            divisor = num2;
        }
        else {
            divisor = num1;
        }
        while( (num1 % divisor != 0) || (num2 % divisor != 0) ){

            divisor--;

        }
        // Output message dialog box

        JOptionPane.showMessageDialog(null, "The greatest common divisor for " + num1 + " and "+ num2 +" is "+ divisor);

    }
}
