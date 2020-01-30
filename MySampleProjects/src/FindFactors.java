import javax.swing.JOptionPane;

public class FindFactors {
    public static void main(String[]args){

        // Taking input using JOptionPane

        int User_Input = Integer.parseInt(
                JOptionPane.showInputDialog(null, "Enter a number: " )
        );
        int i = User_Input;

        int counter = 0;

        // Using a while loop to iterate the result

        while(i<=1000 && i>=100){
            i++;
            if (i % 5 == 0 && i % 6 == 0) {
                        if (i == i){
                            System.out.print( i + " ");
                            counter ++;

                            while (counter == 10){
                                System.out.print("\n");
                                counter = 0;

                            }



                        }

                }
            }


            }
        }


