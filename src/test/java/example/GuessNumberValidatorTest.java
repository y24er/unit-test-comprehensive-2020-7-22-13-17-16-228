package example;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class GuessNumberValidatorTest {
    @Test
    void should_return_wrong_input_input_again_when_validate_given_guess_numbers_has_same_number() {
        //given
        GuessNumbersValidator guessNumbersValidator = new GuessNumbersValidator();
        int[] guessNumbers = new int[]{2, 3, 4, 3};

        //when
        String validateResult = guessNumbersValidator.validate(guessNumbers);

        //then
        assertThat(validateResult, is("Wrong Input，Input again"));
    }

    @Test
    void should_return_wrong_input_input_again_when_validate_given_guess_numbers_less_than_4() {
        //given
        GuessNumbersValidator guessNumbersValidator = new GuessNumbersValidator();
        int[] guessNumbers = new int[]{2, 3};

        //when
        String validateResult = guessNumbersValidator.validate(guessNumbers);

        //then
        assertThat(validateResult, is("Wrong Input，Input again"));
    }

    @Test
    void should_return_wrong_input_input_again_when_validate_given_guess_numbers_has_out_og_range() {
        //given
        GuessNumbersValidator guessNumbersValidator = new GuessNumbersValidator();
        int[] guessNumbers = new int[]{2, 10, 4, 6};

        //when
        String validateResult = guessNumbersValidator.validate(guessNumbers);

        //then
        assertThat(validateResult, is("Wrong Input，Input again"));
    }
}
