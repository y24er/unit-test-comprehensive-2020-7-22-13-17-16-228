package example;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.io.IOException;

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

    @Test
    void should_return_0A0B_when_guess_number_given_answer_is_1234_and_guess_number_is_5678() {
        //given
        AnswerGenerator morkAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(morkAnswerGenerator.generator()).willReturn(new int[]{1, 2, 3, 4});
        int[] guessNumber = {5, 6, 7, 8};

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(morkAnswerGenerator);
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A0B", actual);
    }

    @Test
    void should_return_2A2B_when_guess_number_given_answer_is_1234_and_guess_number_is_1243() {
        //given
        AnswerGenerator morkAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(morkAnswerGenerator.generator()).willReturn(new int[]{1, 2, 3, 4});
        int[] guessNumber = {1, 2, 4, 3};

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(morkAnswerGenerator);
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("2A2B", actual);
    }

    @Test
    void should_return_0A2B_when_guess_number_given_answer_is_1234_and_guess_number_is_2107() {
        //given
        AnswerGenerator morkAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(morkAnswerGenerator.generator()).willReturn(new int[]{1, 2, 3, 4});
        int[] guessNumber = {2, 1, 0, 7};

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(morkAnswerGenerator);
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A2B", actual);
    }

    @Test
    void should_return_0A4B_when_guess_number_given_answer_is_1234_and_guess_number_is_4321() {
        //given
        AnswerGenerator morkAnswerGenerator = Mockito.mock(AnswerGenerator.class);
        given(morkAnswerGenerator.generator()).willReturn(new int[]{1, 2, 3, 4});
        int[] guessNumber = {4, 3, 2, 1};

        //when
        GuessNumberGame guessNumberGame = new GuessNumberGame(morkAnswerGenerator);
        String actual = guessNumberGame.guess(guessNumber);

        //then
        assertEquals("0A4B", actual);
    }

    @Test
    void should_game_result_when_play_given_guess_numbers() throws IOException {
        //given
        GuessNumberGame guessNumberGame = new GuessNumberGame(new AnswerGeneratorImpl());

        //when
        guessNumberGame.play();
        //需要用Scanner输入数字，在help->Edit Custome VM Options里设置-Deditable.java.test.console=true

        //then
        //获取最终结果，我还得查一下怎么处理
//        assertEquals("Game Over! You are lose!");

    }

}
