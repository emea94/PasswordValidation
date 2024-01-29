package org.example;

import org.junit.jupiter.api.Test;

import static org.example.passwortValidation.passwordIsValid;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void passwordIsValid_whenPasswordHasLessThan8Characters_thenReturnFalse() {
        //Given
        String passwort1 = "aabbcc";
        boolean expected = false;
        //When
        boolean actual = passwortValidation.passwordIsValid(passwort1);
        //Then
        assertFalse(actual);
    }

    @Test
    void passwordIsValid_whenPasswordHasNoDigit_thenReturnFalse() {
        //Given
        String passwort2 = "aabbccdd";
        boolean expected = false;
        //When
        boolean actual = passwortValidation.passwordIsValid(passwort2);
        //Then
        assertFalse(actual);
    }

    @Test
    void passwordIsValid_whenPasswordHasNoUppercaseLetter_thenReturnFalse() {
        //Given
        String passwort3 = "aabbcc11";
        boolean expected = false;
        //When
        boolean actual = passwortValidation.passwordIsValid(passwort3);
        //Then
        assertFalse(actual);
    }

    @Test
    void passwordIsValid_whenPasswordHasNoLowercaseLetter_thenReturnFalse() {
        //Given
        String passwort4 = "AABBCC11";
        boolean expected = false;
        //When
        boolean actual = passwortValidation.passwordIsValid(passwort4);
        //Then
        assertFalse(actual);
    }

    @Test
    void passwordIsValid_whenPasswordIsCommonlyUsed_thenReturnTrue() {
        //Given
        String passwort5 = "Passwort123";
        boolean expected = false;
        //When
        boolean actual = passwortValidation.passwordIsValid(passwort5);
        //Then
        assertFalse(actual);
    }

}