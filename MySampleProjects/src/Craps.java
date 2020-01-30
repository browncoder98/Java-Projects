import java.util.Random; // Library imported for random number generator

public class Craps {


        // Method created for rolling the Dice
        public static int Dice_Roll() {
            // Generate a random number between 1 to 6
            Random randomGenerator = new Random();
            int randomInt = randomGenerator.nextInt(6) + 1;
            return randomInt;
        }

        // Method created for calculating the sum of the two dices rolled
        public static int SumOfTwoDice() {
            int first_dice = Dice_Roll();
            int second_dice = Dice_Roll();
            int sum;
            sum = first_dice + second_dice;
            System.out.println("You rolled " + first_dice + " + " + second_dice + " = " + sum);
            return sum;
        }

        // Method created to calculate and return the total score on the dice
        public static int TotalScore(int score) {
            // If the score is 2, 3, or 12 method returns 0, If the score is 7 or 11  method returns 1
            switch (score) {
                case 2  :
                case 3  :
                case 12 : score = 0; break;
                case 7  :
                case 11 : score = 1; break;
            }
            return score;
        }

        // Method created to show whether the player wins or not
        public static void ShowResult(int result) {
            if (result == 0)
                System.out.println("You lose");
            else if (result == 1)
                System.out.println("You win");
        }

        // Method returns true if you won and vice versa if you lose
        public static boolean NaturalOrCraps(int result) {
            return result == 0 || result == 1;
        }

        // Method created for rolling the two dice until either a 7 or the same point value is obtained
        public static void KeepRolling_until_WinOrLose(int point) {
            int result;

            do {
                result = SumOfTwoDice();
            } while (result != point && result != 7);

            // If 7 is rolled, player loses. Otherwise, player wins.
            if (result == 7)
                ShowResult(0);
            else
                ShowResult(1);
        }

        public static void main(String[] args) {
        // Rolls two dice
        int point = SumOfTwoDice();

        // Checks the sum of the two dice for craps or natural
        int result = TotalScore(point);

        // If result is craps or natural print result
        if (NaturalOrCraps(result)) {
            ShowResult(result);
        }
        else {
            // Continue to roll dice till you win or lose
            KeepRolling_until_WinOrLose(result);
        }
    }
}


