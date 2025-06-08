package hw_11;

import hw.hw_11_testing_code.CountWords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {
    private CountWords countWords;

    @BeforeEach
    public void setupTest() {
        countWords = new CountWords();
    }

    @ParameterizedTest
    @ValueSource(strings = {""}) // если через @CSVSource ({"\"\", 0}) -> actualResult = 1 => SOLUTION:@CsvSource({"'', 0"})
    public void userShouldGetZeroWordsIfStringIsEmpty(String sentence) {
        int actualResult = countWords.countWords(sentence);

        assertEquals(0,actualResult);
    }

    @ParameterizedTest
    @NullSource
    public void userShouldGetExceptionIfStringIsNull(String sentence) {
        assertThrows(NullPointerException.class,() -> {countWords.countWords(sentence);});
    }

    @ParameterizedTest
    @CsvSource({
            // a few spaces
            " hello world , 2",
            // ordinary sentence
            "Good morning!, 2"
    })
    public void userCanCountWordsIfStringIsValid(String sentence, int expectedResult) {
        int actualResult = countWords.countWords(sentence);

        assertEquals(expectedResult,actualResult);
    }


}
