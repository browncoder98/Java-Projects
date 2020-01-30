import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[]args){

        int h, q, m, k, j, year;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: (e.g., 2012): ");
        year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        m = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        q = input.nextInt();

        j = year/100;
        k = year % 100;
        h = ((q + ((26*(m+1))/10) + k + (k/4) + (j/4) + (5*j)) % 7);


        if(m == 1){
            m = 13;
            year--;
        }
        else if(m == 2){
            m = 14;
            year--;
        }

        switch (h)
        {
            case 0:
                System.out.print("Day of the week is Saturday.");
                break;
            case 1:
                System.out.print("Day of the week is Sunday.");
                break;
            case 2:
                System.out.print("Day of the week is Monday.");
                break;
            case 3:
                System.out.print("Day of the week is Tuesday.");
                break;
            case 4:
                System.out.print("Day of the week is Wednesday.");
                break;
            case 5:
                System.out.print("Day of the week is Thursday.");
                break;
            case 6:
                System.out.print("Day of the week is Friday.");
                break;




        }

    }
}
