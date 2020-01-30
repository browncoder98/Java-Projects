public class MethodPractice {
    public static int Sum(int Integer_1, int Integer_2) {

        int sum = 0;

        for (int i = Integer_1; i <= Integer_2; i++) {
            sum = sum + i;

        }
        return sum;
    }

    public static void main(String[]args){
            System.out.println(" The sum of numbers from 1 to 10 is " + Sum(1,10));
            System.out.println(" The sum of numbers from 20 to 30 is " + Sum(20,30));
            System.out.println(" The sum of numbers from 35 to 45 is " + Sum(35,45));
        }
    }

