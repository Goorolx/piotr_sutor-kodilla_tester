package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource (strings = {"aa", "!79", "A"})
    public void shouldReturnFalseWhenLessThan3charOrWrong(String userName) {
        assertFalse(validator.validateUsername(userName));
    }
    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String text) {
        assertFalse(validator.validateUsername(text));
    }
    @ParameterizedTest
    @ValueSource (strings = {"aaaa", "789000", "A2333"})
    public void shouldReturnTrueWhenCorrectName(String userName) {
        assertTrue(validator.validateUsername(userName));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseWhenEmpty(String email){
        System.out.println("email " +email + "! ");
        assertFalse(validator.validateEmail(email));
    }
    @ParameterizedTest
    @ValueSource (strings = {"aaaa@bbb.com", "a@b.pl", "_dys@dat.pl"})
    public void shouldReturnTrueWhenCorrectEmail(String email) {
        assertTrue(validator.validateEmail(email));
    }

    @ParameterizedTest
    @ValueSource (strings = {"!!!!@bbb.com", "@b.pl", "dys.dat.pl","alll@llll.","llll@aa","_#%@com.pl"})
    public void shouldReturnFalseWhenWrongEmail(String email) {
        assertFalse(validator.validateEmail(email));
    }
}