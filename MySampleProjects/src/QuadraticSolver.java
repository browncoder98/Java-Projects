import java.util.Scanner; // importing the library for Scanner input

public class QuadraticSolver {
    public static void main(String[]args){

        // Variables data type declared alongside the variables

        double a,b,c, discriminant, x, r1, r2;

        System.out.print("Enter a, b, c: ");

        // input variable for Scanner function declared

        Scanner input = new Scanner(System.in);
        a = input.nextDouble();
        b = input.nextDouble();
        c = input.nextDouble();

        discriminant = (b*b)-(4*a*c);

        // x represents everything inside the square root for getting the discriminant's square root

        x = Math.pow(discriminant , 0.5);


        r1 = ((-b+x)/(2*a));
        r2 = ((-b-x)/(2*a));
        // Conditional statements for correct output written

        if(discriminant > 0){
            System.out.printf("The equation has two roots %.6f and %.6f" , r1, r2);

        }
        else if(discriminant == 0){
            System.out.printf("The equation has one root %.0f" , r1 );

        }
        else{
            System.out.println("The equation has no real roots");

        }
    }
}

