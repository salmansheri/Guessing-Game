import java.util.Scanner;

public class guessinggame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int) (10 * Math.random());
        System.out.println("Guess the number: ");
        int guess = sc.nextInt();

        if (number == guess) {

            System.out.println("Congratulation you guessed correctly");

        }

        else  {
            System.out.println("You Lost Better luck next time");


        }

        System.out.println("The number is " + number);



    }
}
