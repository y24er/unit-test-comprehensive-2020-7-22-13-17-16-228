package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.BDDMockito.given;

public class GuessNumberGameTest {
    @Test
    void should_return_4A0B_when_guess_number_given_answer_is_1234_and_guess_number_is_1234() {
        //given
        AnswerGenerator morkAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(morkAnswerGenerator.generator()).willReturn(new int[]{1, 2, 3, 4});
        int[] guessNumber = {1, 2, 3, 4};

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(morkAnswerGenerator);
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("4A0B", actual);
    }

    @Test
    void should_return_1A1B_when_guess_number_given_answer_is_1234_and_guess_number_is_1025() {
        //given
        AnswerGenerator morkAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(morkAnswerGenerator.generator()).willReturn(new int[]{1, 2, 3, 4});
        int[] guessNumber = {1, 0, 2, 5};

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(morkAnswerGenerator);
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("1A1B", actual);
    }
}
