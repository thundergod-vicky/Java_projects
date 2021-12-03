import java.util.Random;
import java.util.Scanner;

public class Number_guess_game {

    public static void main(String[] args) {

        int guess;
        int secretNum;

        boolean correct = false;

        Scanner keyboard = new Scanner(System.in);

        Random rand = new Random();

        System.out.println("Give me a Secret Number");

        secretNum = rand.nextInt(100);

        while (!correct)

        {

            System.out.println("GUESS :");
            guess = keyboard.nextInt();

            if (guess == secretNum) {
                correct = true;
                System.out.println("OH! You are correct.");
            }

            else if (guess < secretNum) {
                System.out.println("Oops ! Try Higher.");
            } else if (guess > secretNum) {
                System.out.println("Try Lower");

            }
        }

    }

}
