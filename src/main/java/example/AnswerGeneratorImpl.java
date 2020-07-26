package example;

import java.util.Random;

public class AnswerGeneratorImpl implements AnswerGenerator {
    int[] answers = new int[4];

    public int[] generator() {
        Random random = new Random();
        int randomNumber = 0;
        int num = 0;
        while (num < 4) {
            randomNumber = random.nextInt(10);
            if (!contains(answers, randomNumber)) {
                answers[num++] = randomNumber;
            }
        }
        return answers;
    }

    private boolean contains(int[] answers, int randomNumber) {
        boolean isIn = false;
        for (int answer : answers) {
            if (randomNumber == answer) {
                isIn = true;
            }
        }
        return isIn;
    }

    public int[] getAnswers() {
        return answers;
    }
}
