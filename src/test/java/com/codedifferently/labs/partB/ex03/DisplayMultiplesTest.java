package com.codedifferently.labs.partB.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex03.DisplayMultiples;

public class DisplayMultiplesTest {
    @Test
    public void displayTest(){
        String expected = "0 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48";
        String actual = DisplayMultiples.displayWithMultiples();
        Assertions.assertEquals(expected, actual);
    }
}
