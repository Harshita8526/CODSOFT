import java.util.*;

public class Task1 {
    private static final int Max_t = 10;


    public static void guess(int num, int randomNum) {
        int t = 0;
        while (num != randomNum && t < Max_t) {

            if (num < randomNum) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess is too high");
            }
            t++;
            System.out.print("Enter your next guess: ");
            num = new Scanner(System.in).nextInt();
        }


        if (num == randomNum) {
            System.out.println("Congratulations!! You got " + (100 - (t * 10)) + " points.");
        } else {
            System.out.println("Sorry!! You Lost. Correct number is " + randomNum);
            System.out.println("Try Again");
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {

            System.out.println("Welcome to the Number Guessing Game!");
            System.out.println("You have only 10 chances to win the game.All The Best!! ");

            Random rand1 = new Random();
            int num = rand1.nextInt(100) + 1;

            System.out.print("Hey, I am guessing a number from range 1-100. ");
            int user_guess = in.nextInt();


            if (user_guess < 1 || user_guess > 100) {
                System.out.println("Invalid! Enter a valid number in the range of 1-100.");
            } else {
                guess(user_guess, num);
            }

            System.out.print("Do you want to play again? (yes/no): ");
        } while ("yes".equalsIgnoreCase(in.next()));
        in.close();
    }
}

