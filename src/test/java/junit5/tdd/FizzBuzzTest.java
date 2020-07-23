package junit5.tdd;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    @Test
    public void should_return_1_when_count_off_given_1(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(1);

        // then
        assertEquals("1",result);

    }
    @Test
    public void should_return_fizz_when_count_off_given_3(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(3);

        // then
        assertEquals("Fizz",result);

    }
    @Test
    public void should_return_buzz_when_count_off_given_5(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(5);

        // then
        assertEquals("Buzz",result);

    }

    @Test
    public void should_return_whizz_when_count_off_given_7(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(7);

        // then
        assertEquals("Whizz",result);

    }

    @Test
    public void should_return_fizzbuzz_when_count_off_given_15(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(15);

        // then
        assertEquals("FizzBuzz",result);

    }

    @Test
    public void should_return_fizzwhizz_when_count_off_given_21(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(21);

        // then
        assertEquals("FizzWhizz",result);

    }

    @Test
    public void should_return_buzzwhizz_when_count_off_given_35(){

        // given
        FizzBuzz fizzBuzz = new FizzBuzz();

        // when
        String result = fizzBuzz.play(35);

        // then
        assertEquals("BuzzWhizz",result);

    }



}
