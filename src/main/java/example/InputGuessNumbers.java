package example;

import java.util.Scanner;

public class InputGuessNumbers {
    int[] guessNumbers = new int[4];

    public int[] inputGuessNumber() {
        Scanner scanner = new Scanner(System.in);
        String inputs = scanner.nextLine();
        String[] guessString = inputs.split(" ");
        for (int i = 0; i < guessString.length; i++) {
            guessNumbers[i] = Integer.parseInt(guessString[i]);
        }
        return guessNumbers;
    }
}
