package com.codedifferently.labs.partC;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partC.AlgoChallenge;

public class AlgoChallengeTest {
    // Problem 16
    @Test
    public void multipleOfTest01() {

        // Given
        int n = 3;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest02() {

        // Given
        int n = 10;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest03() {

        // Given
        int n = 8;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void multipleOfTest04() {

        // Given
        int n = 58;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.multipleOf(n);

        // Then
        Assertions.assertEquals(expected,actual);
    }


    // Problem 17
    @Test
    public void checkTempTest01(){

        // Given
        int a = 120;
        int b = -1;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest02(){

        // Given
        int a = -1;
        int b = 120;

        // When
        Boolean expected = true;
        Boolean actual = AlgoChallenge.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest03(){

        // Given
        int a = 2;
        int b = 120;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void checkTempTest04(){

        // Given
        int a = 0;
        int b = 115;

        // When
        Boolean expected = false;
        Boolean actual = AlgoChallenge.checkTemp(a, b);

        // Then
        Assertions.assertEquals(expected, actual);
    }

}
