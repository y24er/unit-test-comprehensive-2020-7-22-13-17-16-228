package example;

import java.util.Arrays;

public class GuessNumberGame {
    AnswerGenerator answerGenerator;

    public GuessNumberGame(AnswerGenerator morkAnswerGenerator) {
        this.answerGenerator = morkAnswerGenerator;
    }

    public String guess(int[] guessNumber) {
        int[] answer = answerGenerator.generator();
        if (Arrays.equals(answer, guessNumber)) {
            return "4A0B";
        }

        return null;
    }

}
