package example;

public class GuessNumbersValidator {
    public String validate(int[] guessNumbers) {
        String validateResult = null;
        if (guessNumbers.length < 4 || hasSameNumber(guessNumbers) || hasNotInRangeNumber(guessNumbers))
            validateResult = "Wrong Input，Input again";
        return validateResult;
    }

    public boolean hasNotInRangeNumber(int[] guessNumbers) {
        boolean hasNotInRange = false;
        for (int guessNumber : guessNumbers) {
            if (guessNumber < 0 || guessNumber > 9)
                hasNotInRange = true;
        }
        return hasNotInRange;
    }

    public boolean hasSameNumber(int[] guessNumbers) {
        boolean hasSame = false;
        for (int i = 0; i < guessNumbers.length; i++) {
            for (int j = i + 1; j < guessNumbers.length; j++) {
                if (guessNumbers[i] == guessNumbers[j])
                    hasSame = true;
            }
        }
        return hasSame;
    }
}
