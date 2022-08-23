import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the token (5, 10, or 15 characters).");

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("Please enter an integer.");
        }

        int tokenLength = scanner.nextInt();
        String result = (tokenLength == 5 || tokenLength == 10 || tokenLength == 15) ? tokenGenerator(tokenLength) :
                "Sorry, the length of your token is invalid. Please try again.";
        System.out.println("Your token is: " + result);
        scanner.close();
    }

    private static String tokenGenerator(int tokenLength) {
        String token = "";
        Random randomNumber = new Random();

        for (int i = 0; i < tokenLength; i++) {
            int currentASCII = randomNumber.nextInt(123 - 33) + 33;
            char currentCharacter = (char) currentASCII;
            token += currentCharacter;
        }
        return token;
    }
}
