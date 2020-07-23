package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessNumberGame {
    private int[] answers;

    public GuessNumberGame(AnswerGenerator morkAnswerGenerator) {
        this.answers = morkAnswerGenerator.generator();
    }

    public String guess(int[] guessNumbers) {
        if (Arrays.equals(answers, guessNumbers)) {
            return "4A0B";
        } else {
            return count(guessNumbers);
        }

    }

    public String count(int[] guessNumbers) {
        int countA = 0;
        int countB = 0;
        List<Integer> answerNoIncludeTheSame = new ArrayList<>();
        List<Integer> guessNoIncludeTheSame = new ArrayList<>();

        for (int index = 0; index < guessNumbers.length; index++) {
            if (answers[index] == guessNumbers[index]) {
                countA++;
            } else {
                answerNoIncludeTheSame.add(answers[index]);
                guessNoIncludeTheSame.add(guessNumbers[index]);
            }
        }
        for (int index = 0; index < answerNoIncludeTheSame.size(); index++) {
            if (answerNoIncludeTheSame.contains(guessNoIncludeTheSame.get(index)))
                countB++;
        }
        return countA + "A" + countB + "B";
    }

}
