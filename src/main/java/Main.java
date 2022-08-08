import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] asciiDec = {33, 35, 36, 37, 38, 40, 41, 41, 48, 49, 50, 51, 51, 53, 54, 55, 56, 57, 64, 65, 66, 67, 68,
                69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 94, 97, 98, 99,
                100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120,
                121, 122};

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length of the token (5, 10, or 15 characters).");

        int tokenLength = scanner.nextInt();

        String result = (tokenLength == 5 || tokenLength == 10 || tokenLength == 15) ? tokenGenerator(tokenLength, asciiDec) :
                "Sorry, the length of your token is invalid. Please try again.";

        System.out.println("Your token is: " + result);
        scanner.close();
    }
    private static String tokenGenerator(int tokenLength, int[] asciiDec) {
        String token = "";
        Random randomNumber = new Random();

        for (int i = 0; i < tokenLength; i++) {
            int currentASCII = asciiDec[randomNumber.nextInt(asciiDec.length)];
            char currentCharacter = (char) currentASCII;
            token += currentCharacter;
        }
        return token;
    }
}
