import javax.swing.JOptionPane; // importing library for JOptionPane
import java.util.Random; // importing library for Random number generator

public class RockPapersScissors{
    public static void main(String[]args){
        double UserMove = Double.parseDouble( // using parse for double data type input and creating user's move input variable
                JOptionPane.showInputDialog(null, "scissor (0), rock(1), paper(2): ")
        );
        Random OpponentSelection = new Random(); // variable for Computer's move created
        int OpponentMove = OpponentSelection.nextInt(2);


        // Conditional statements and nested if statements for the correct outputs

        if (UserMove == OpponentMove){
            if (UserMove == 0){
                JOptionPane.showMessageDialog(null, "The computer is scissor. You are scissor. It is a draw!!");
            }
            else if (UserMove == 1){
                JOptionPane.showMessageDialog(null, "The computer is rock. You are rock. It is a draw!!");
            }
            else if (UserMove == 2){
                JOptionPane.showMessageDialog(null, "The computer is paper. You are paper. It is a draw!!");
            }
        }
        else if (UserMove > OpponentMove){
            if (UserMove == 1){
                JOptionPane.showMessageDialog(null, "The computer is scissor. You are rock. You won!!");
            }
            else if (UserMove == 2){
                JOptionPane.showMessageDialog(null, "The computer is rock. You are paper. You won!!");
            }

        }
        else if(UserMove < OpponentMove){
            if (OpponentMove == 1){
                JOptionPane.showMessageDialog(null, "The computer is rock. You are scissor. The computer won!!");
            }
            else if(OpponentMove == 2){
                JOptionPane.showMessageDialog(null, "The computer is paper. You are rock. The computer won!!");
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid input!!");
            }
        }



    }
}

