import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            // generate a random number between 1 and 10
            int randomNumber1 = generateRandomNumber();
            int randomNumber2 = generateRandomNumber();

            // swap the numbers if the first number is greater than the second number
            if (randomNumber1 < randomNumber2) {
                int temp = randomNumber1;
                randomNumber1 = randomNumber2;
                randomNumber2 = temp;
            }
            int answer = randomNumber1 - randomNumber2;
            System.out.println("What is " + randomNumber1 + " - " + randomNumber2 + " ?");
            int userAnswer = scanner.nextInt();
            if (userAnswer == answer) {
                System.out.println("Correct!");
            } else {
                System.out.println("Incorrect! The correct answer is " + answer);
            }
            System.out.println("Do you want to play again? (y/n)");
            String playAgain = scanner.next();
            if (playAgain.equals("n")) {
                scanner.close();
                break;
            }

        }

    }

    // using the random Math class generate a random number between 1 and 10
    public static int generateRandomNumber() {
        return (int) (Math.random() * 10) + 1;
    }
}
