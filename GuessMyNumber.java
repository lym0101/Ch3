import java.util.Scanner;

public class GuessMyNumber {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100) + 1; // Random number between 1 and 100
        //int guess;
        //int attempts = 0;
        System.out.println("Welcome to the Guess My Number game!");
        System.out.println("I'm thinking of a number between 1 and 100 (including both). Can you guess what it is?");
        System.out.println("Type a Number: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your guess is: " + number);
        System.out.println("The Number was: " + number);
}