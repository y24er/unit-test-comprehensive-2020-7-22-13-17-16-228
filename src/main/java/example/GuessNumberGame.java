package example;

import java.util.ArrayList;
import java.util.List;

public class GuessNumberGame {
    private int[] answers;
    private int times;
    private GuessNumbersValidator guessNumbersValidator = new GuessNumbersValidator();

    public GuessNumberGame(AnswerGenerator answerGenerator) {
        this.answers = answerGenerator.generator();
    }

    public static void main(String[] args) {
        AnswerGeneratorImpl answerGenerator = new AnswerGeneratorImpl();
        GuessNumberGame guessNumberGame = new GuessNumberGame(answerGenerator);
        int[] answer = answerGenerator.getAnswers();
        for (int i : answer) {
            System.out.print(i);
        }
        System.out.println();
        guessNumberGame.play();
    }

    public String guess(int[] guessNumbers) {
        times++;
        return count(guessNumbers);

    }

    public String count(int[] guessNumbers) {
        int rightPositionRightNumberCounter = 0;
        int wrongPositionRightNumberCounter = 0;

        List<Integer> answerList = new ArrayList<>();
        for (int answer : answers) {
            answerList.add(answer);
        }
        for (int index = 0; index < guessNumbers.length; index++) {
            if (answers[index] == guessNumbers[index]) {
                rightPositionRightNumberCounter++;
            } else {
                if (answerList.contains(guessNumbers[index]))
                    wrongPositionRightNumberCounter++;
            }
        }
        return rightPositionRightNumberCounter + "A" + wrongPositionRightNumberCounter + "B";
    }

    public void play() {
        System.out.println("Game Begin!");
        InputGuessNumbers inputGuessNumbers = new InputGuessNumbers();
        String guessResult = null;

        while (times < 6 && !"4A0B".equals(guessResult)) {
            int[] guessNumbers = inputGuessNumbers.inputGuessNumber();
            String validaResult = guessNumbersValidator.validate(guessNumbers);
            if (validaResult == null) {
                guessResult = guess(guessNumbers);
                System.out.println(guessResult);
            } else
                System.out.println(validaResult);
        }
        if (times >= 6) {
            System.out.print("Game Over! You are lose!\n");
        } else {
            System.out.print("Congratulation! You are win!\n");
        }
    }


}
