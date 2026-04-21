package UserTests;

import ComplexTasks.User.InvalidUserException;
import ComplexTasks.User.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTests {
    private UserValidator userValidator;

    @BeforeEach
    public void setup() {
        userValidator = new UserValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"Alex", "Ivan78", "Kolya"})
    public void validNameValidator(String name) {
        boolean actualName = userValidator.isNameValid(name);
        assertTrue(actualName);
    }

    @ParameterizedTest
    @ValueSource(strings = {"alex", "", "234"})
    public void notValidNameValidator(String name) {
        boolean actualName = userValidator.isNameValid(name);
        assertFalse(actualName);
    }

    @Test
    public void nullNameValidator() {
        boolean actualName = userValidator.isNameValid(null);
        assertFalse(actualName);
    }

    @ParameterizedTest
    @ValueSource(ints = {18, 67, 100, 34})
    public void validAgeValidator(int age) {
        boolean actualAge = userValidator.isAgeValid(age);
        assertTrue(actualAge);
    }

    @ParameterizedTest
    @ValueSource(ints = {-18, 7, 0, 120})
    public void notValidAgeValidator(int age) {
        boolean actualAge = userValidator.isAgeValid(age);
        assertFalse(actualAge);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@example.com", "goodEmail@vk.com", "no-at-symbol@email.com"})
    public void testValidEmails(String words) {
        boolean actualResult = userValidator.isValidEmail(words);
        assertTrue(actualResult);
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@.com", "bad@.com", "no-at-symbol", "", "3456",})
    public void testInvalidEmails(String words) {
        boolean actualResult = userValidator.isValidEmail(words);
        assertFalse(actualResult);
    }


    @Test
    public void checkAllValuesException() {
        userValidator.setValidationEnabled(true);
        assertThrows(InvalidUserException.class, () -> {
            userValidator.checkAllValues("Ivan", 76, "34yh.com");
        }, "If input is invalid InvalidUserException should be thrown");
    }
}
