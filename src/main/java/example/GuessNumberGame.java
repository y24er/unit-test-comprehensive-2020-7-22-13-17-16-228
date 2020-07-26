package example;

import java.util.ArrayList;
import java.util.List;

public class GuessNumberGame implements AnswerGenerator {
    private int[] answers;

    public GuessNumberGame(AnswerGenerator morkAnswerGenerator) {
        this.answers = morkAnswerGenerator.generator();
    }

    public String guess(int[] guessNumbers) {
        return count(guessNumbers);

    }

    public String count(int[] guessNumbers) {
        int countA = 0;
        int countB = 0;

        List<Integer> answerList = new ArrayList<>();
        for (int answer : answers) {
            answerList.add(answer);
        }
        for (int index = 0; index < guessNumbers.length; index++) {
            if (answers[index] == guessNumbers[index]) {
                countA++;
            } else {
                if (answerList.contains(guessNumbers[index]))
                    countB++;
            }
        }
        return countA + "A" + countB + "B";
    }

    @Override
    public int[] generator() {
        int[] answers = new int[4];
        for (int i = 0; i < 4; i++) {
            int answer = (int) (Math.random() * 9);
            answers[i] = answer;
        }
        return answers;
    }
}
