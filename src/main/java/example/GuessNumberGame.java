package example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GuessNumberGame {
    AnswerGenerator answerGenerator;

    public GuessNumberGame(AnswerGenerator morkAnswerGenerator) {
        this.answerGenerator = morkAnswerGenerator;
    }

    public String guess(int[] guessNumber) {
        int[] answer = answerGenerator.generator();
        if (Arrays.equals(answer, guessNumber)) {
            return "4A0B";
        } else {
            return count(guessNumber);
        }

    }

    public String count(int[] guessNumbers) {
        int countA = 0;
        int countB = 0;
        List<Integer> answerNoIncludeTheSame = new ArrayList<>();
        List<Integer> guessNoIncludeTheSame = new ArrayList<>();

        int[] answers = answerGenerator.generator();
        for (int index = 0; index < guessNumbers.length; index++) {
            if (answers[index] == guessNumbers[index]) {
                countA++;
            } else {
                answerNoIncludeTheSame.add(answers[index]);
                guessNoIncludeTheSame.add(guessNumbers[index]);
            }
        }
        for (int index = 0; index < answerNoIncludeTheSame.size(); index++) {
            if (answerNoIncludeTheSame.contains(answerNoIncludeTheSame.get(index)))
                countB++;
        }
        return countA + "A" + countB + "B";
    }

}
