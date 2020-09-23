package com.kodilla.exception.test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SecondChallengeTest {

    @Test
    void probablyIWillThrowException() {
        //Given
        SecondChallenge secondChallenge = new SecondChallenge();

        //When & then
        assertAll(
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 0.0)), // (1, 2, 3) not OK
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.99, 1.6)), // (1, 2, 3) not OK
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.01, 0.0)), // (1, 2, 3) not OK
                () -> assertDoesNotThrow(() -> secondChallenge.probablyIWillThrowException(1.01, 1.6)), // (1, 2, 3) not OK
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 1.0)), //(1) OK, (2, 3) not OK
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(0.9, 1.0)), //(2) OK, (1, 3) not OK
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(1.1, 1.5)), //(3) OK, (1, 2) not OK
                () -> assertThrows(Exception.class, () -> secondChallenge.probablyIWillThrowException(2.1, 1.5)) //(1, 3) OK, (2) not OK

        );


    }
}