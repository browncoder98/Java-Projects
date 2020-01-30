import javax.swing.JOptionPane;

public class WindChill {
    public static void main(String[]args){
        double wind_chill;
        double temperature = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Enter the temperature in Fahrenheit between -58°F and 41°F:")
        );
        double wind_speed = Double.parseDouble(
                JOptionPane.showInputDialog(null, "Enter the wind speed (>=2) in miles per hour: ")
        );
        wind_speed = Math.pow(wind_speed, 0.16);
        wind_chill = 35.74 + (0.6215*temperature)-(35.75*wind_speed)+(0.4275*temperature*wind_speed);

        JOptionPane.showMessageDialog(null, "The wind chill index is "+ wind_chill);
    }
}
