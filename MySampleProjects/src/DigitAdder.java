import java.util.Scanner;
public class DigitAdder {
    public static void main(String[]args){

            System.out.println("Enter a number between 1 and 1000: ");
            int Number, Last_Digit, Sum = 0  ;

            Scanner input = new Scanner(System.in);
            Number = input.nextInt();

            while(Number>0){
                Last_Digit = Number % 10;
                Sum = Sum + Last_Digit;
                Number = Number/10;
            }

            System.out.println("The sum of the digits of the number is " + Sum);
        }
    }



