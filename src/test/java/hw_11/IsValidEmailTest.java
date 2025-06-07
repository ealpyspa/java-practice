package hw_11;

import hw.hw_11_testing_code.IsValidEmail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidEmailTest {
    /**
     * валидные email:
     *  john.doe@example.com -> true
     *  user_123@domain.co -> true
     *  user-name@sub.domain.org -> true
     *  a@b.cd -> true
     *  x@x.io -> true
     * невалидные email:
     *   нет @
     *      john.doe.example.com -> false
     *      username.domain.com -> false
     *   невалидный домен:
     *      user@domain      ← нет точки -> false
     *      user@domain.c    ← TLD меньше 2 символов -> false
     *      user@domain.     ← нет TLD -> false
     *   недопустимые символы:
     *      user+test@domain.com   ← `+` не разрешён -> false
     *      user@do!main.com       ← `!` не входит в `[\w.-]` -> false
     *   пробелы:
     *      user name@domain.com
     *      user@domain.com
     *      user@domain.com
     *  пустые строки и null:
     *      ""     ← пустая строка
     *      null   ← null значение
     */

    private IsValidEmail isValidEmail;

    @BeforeEach
    public void setupTest() {
        isValidEmail = new IsValidEmail();
    }

    @ParameterizedTest
    @ValueSource(strings = {"john.doe@example.com",
                            "user_123@domain.co",
                            "user-name@sub.domain.org",
                            "a@b.cd",
                            "x@x.io"})
    public void userShouldGetTrueIfEmailIsValid(String email) {
        boolean actualResult = isValidEmail.isValidEmail(email);

        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {
            // нет @
            "john.doe.example.com",
            "username.domain.com",
            //невалидный домен:
            "user@domain", //нет точки
            "user@domain.c", //TLD меньше 2 символов
            "user@domain.", //нет TLD
            //недопустимые символы:
            "user+test@domain.com", // `+` не разрешён
            "user@do!main.com", // `!` не входит в `[\w.-]`
            // пробелы:
            "user name@domain.com",
            " user@domain.com",
            "user@domain.com ",
            // пустые строки и null:
            ""})
    public void userShouldGetFalseIfEmailIsNotValid(String email) {
        boolean actualResult = isValidEmail.isValidEmail(email);

        assertFalse(actualResult);
    }


    @ParameterizedTest
    @NullSource
    public void userShouldGetExceptionIfEmailIsNull(String email) {
        boolean actualResult = isValidEmail.isValidEmail(email);

        assertFalse(actualResult); //исправила после записи видео
    }
}
