import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class NumbersToWordsTest {

    private NumbersToWords numbersToWords;

    @BeforeEach
    public void setUp() {
        numbersToWords = new NumbersToWords();
    }

    @Test
    public void testZero() {
        assertThat(numbersToWords.getNumberAsWords("0"), is(equalTo("zero")));
    }

    @Test
    public void testOne() {
        assertThat(numbersToWords.getNumberAsWords("1"), is(equalTo("one")));
    }

    @Test
    public void testNine() {
        assertThat(numbersToWords.getNumberAsWords("9"), is(equalTo("nine")));
    }

    @Test
    public void testEleven() {
        assertThat(numbersToWords.getNumberAsWords("11"), is(equalTo("eleven")));
    }

    @Test
    public void testTwenty() {
        assertThat(numbersToWords.getNumberAsWords("20"), is(equalTo("twenty")));
    }

    @Test
    public void testTwentyTwo() {
        assertThat(numbersToWords.getNumberAsWords("22"), is(equalTo("twenty two")));
    }

    @Test
    public void testEightyNine() {
        assertThat(numbersToWords.getNumberAsWords("89"), is(equalTo("eighty nine")));
    }

    @Test
    public void testOneHundred() {
        assertThat(numbersToWords.getNumberAsWords("100"), is(equalTo("one hundred")));
    }

    @Test
    public void testOneHundredOne() {
        assertThat(numbersToWords.getNumberAsWords("101"), is(equalTo("one hundred one")));
    }

    @Test
    public void testOneHundredTwentyThree() {
        assertThat(numbersToWords.getNumberAsWords("123"), is(equalTo("one hundred twenty three")));
    }

    @Test
    public void testOneThousand() {
        assertThat(numbersToWords.getNumberAsWords("1000"), is(equalTo("one thousand")));
    }

    @Test
    public void testOneThousandEleven() {
        assertThat(numbersToWords.getNumberAsWords("1011"), is(equalTo("one thousand eleven")));
    }

    @Test
    public void testOneThousandTwenty() {
        assertThat(numbersToWords.getNumberAsWords("1020"), is(equalTo("one thousand twenty")));
    }

    @Test
    public void testOneThousandTwoHundredThirtyFour() {
        assertThat(numbersToWords.getNumberAsWords("1234"), is(equalTo("one thousand two hundred thirty four")));
    }

    @Test
    public void testNineThousandNinetyNine() {
        assertThat(numbersToWords.getNumberAsWords("9099"), is(equalTo("nine thousand ninety nine")));
    }
}
