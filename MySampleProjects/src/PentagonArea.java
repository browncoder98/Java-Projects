import javax.swing.JOptionPane;

public class PentagonArea {
    public static void main(String[] args) {
           double input = Double.parseDouble(
                    JOptionPane.showInputDialog(null, "Enter the side:")
            );

            JOptionPane.showMessageDialog(null, "The area of the Pentagon  is " + area(input));
        }
        // Method created for returning the area of the pentagon
         public static double area(double side) {

            return (5 * Math.pow(side, 2)) / (4 * Math.tan(Math.PI / 5));

        }
    }

