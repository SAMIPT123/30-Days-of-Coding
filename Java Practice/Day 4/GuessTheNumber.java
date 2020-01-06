import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber() {
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt()) % (max + 1);
    }

    public void play() {

        while (true) {
            int move = scanner.nextInt();
            if (theNumber>move) {
                System.out.println("Number is bigger than that.");
            } else if (theNumber<move) {
                System.out.println("Number is smaller than that.");
            } else {
                System.out.println("You guessed it correctly");
                break;
            }
        }
    }

    public static void howBigIsMyNumber(int num) {
        if (num < 0) {
            System.out.println("Number is less than zero");
        } else if (num >= 0 && num <= 10) {
            System.out.println("Number is relatively small");
        } else if (num >= 11 && num < 100) {
            System.out.println("Relatively bigger number");
        } else {
            System.out.println("Number is bigger than 100");
        }
    }

    public static void main(String[] args) {
        //Scanner scanner= new Scanner(System.in);
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.print("Please enter the number you guessed. Its between 0 and " + guessGame.max + " inclusive: ");
        guessGame.play();
        //int number=scanner.nextInt();
        //howBigIsMyNumber(number);

    }

}
