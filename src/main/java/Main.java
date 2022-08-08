import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the token (5, 10, or 15 characters).");

        int tokenLength = scanner.nextInt();

        String result = (tokenLength == 5 || tokenLength == 10 || tokenLength == 15) ? tokenGenerator(tokenLength) :
                "Sorry, the length is invalid. Please try again.";

        System.out.println(result);
        scanner.close();
    }

    public static String tokenGenerator(int tokenLength) {
        String token = "";
        Random randomNumber = new Random();

        for (int i = 0; i < tokenLength; i++) {
            int currentASCII = (char) randomNumber.nextInt(123 - 33) + 33;
            char currentCharacter = (char) currentASCII;
            token += currentCharacter;
        }
        return token;
    }
}
