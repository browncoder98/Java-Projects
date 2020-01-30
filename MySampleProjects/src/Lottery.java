import javax.swing.JOptionPane;
import java.util.Random;

public class Lottery{
    public static void main(String[]args){

        Random LotteryNumberGenerator = new Random();
        int LotteryNumber = 100 + LotteryNumberGenerator.nextInt(900);

       int InputValue = Integer.parseInt(
               JOptionPane.showInputDialog(null, "Enter a lottery number: ")
       );

        int Input_Digit1 = InputValue / 100;
        int Input_Digit2 = (InputValue / 10) % 10;
        int Input_Digit3 = InputValue % 10;

        int Lottery_Digit1 = LotteryNumber / 100;
        int Lottery_Digit2 = (LotteryNumber / 10) % 10;
        int Lottery_Digit3 = LotteryNumber % 10;

        boolean LotDigit1matchesInputDigit1 = Lottery_Digit1 == Input_Digit1;
        boolean LotDigit1matchesInputDigit2 = Lottery_Digit1 == Input_Digit2;
        boolean LotDigit1matchesInputDigit3 = Lottery_Digit1 == Input_Digit3;
        boolean LotDigit2matchesInputDigit1 = Lottery_Digit2 == Input_Digit1;
        boolean LotDigit2matchesInputDigit2 = Lottery_Digit2 == Input_Digit2;
        boolean LotDigit2matchesInputDigit3 = Lottery_Digit2 == Input_Digit3;
        boolean LotDigit3matchesInputDigit1 = Lottery_Digit3 == Input_Digit1;
        boolean LotDigit3matchesInputDigit2 = Lottery_Digit3 == Input_Digit2;
        boolean LotDigit3matchesInputDigit3 = Lottery_Digit3 == Input_Digit3;

        if(LotteryNumber == InputValue){
            JOptionPane.showMessageDialog(null, "Lottery Number: " + LotteryNumber);
            JOptionPane.showMessageDialog(null, "You won $10000!");
        }
        else if(LotDigit1matchesInputDigit2 || LotDigit1matchesInputDigit3 || LotDigit1matchesInputDigit2){
             if( LotDigit2matchesInputDigit3 || LotDigit2matchesInputDigit2 || LotDigit2matchesInputDigit1 ){
                 if (LotDigit3matchesInputDigit1 || LotDigit3matchesInputDigit2 || LotDigit3matchesInputDigit3){
                     JOptionPane.showMessageDialog(null, "Lottery Number: " + LotteryNumber);
                     JOptionPane.showMessageDialog(null, "You won $3000!");
                 }}}
                 else if(LotDigit1matchesInputDigit1 && LotDigit3matchesInputDigit3 || LotDigit1matchesInputDigit3 && LotDigit3matchesInputDigit1 || LotDigit1matchesInputDigit1 && LotDigit2matchesInputDigit2 || LotDigit1matchesInputDigit2 && LotDigit2matchesInputDigit1 || LotDigit2matchesInputDigit2 && LotDigit3matchesInputDigit3 || LotDigit2matchesInputDigit3 && LotDigit3matchesInputDigit2){
                     JOptionPane.showMessageDialog(null, "Lottery Number: " + LotteryNumber);
                     JOptionPane.showMessageDialog(null, "You won $2000!");

                 }
                 else if (LotDigit1matchesInputDigit1 || LotDigit1matchesInputDigit2 || LotDigit1matchesInputDigit3 || LotDigit2matchesInputDigit1 || LotDigit2matchesInputDigit2 || LotDigit2matchesInputDigit3 || LotDigit3matchesInputDigit1 || LotDigit3matchesInputDigit2 || LotDigit3matchesInputDigit3){
                     JOptionPane.showMessageDialog(null, "Lottery Number: " + LotteryNumber);
                     JOptionPane.showMessageDialog(null, "You won $1000!");
                 }
                 else{
                     JOptionPane.showMessageDialog(null, "Sorry you didn't win anything. Better luck next time!!");
                 }
             }
        }








