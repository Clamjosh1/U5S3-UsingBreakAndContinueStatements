package com.codedifferently.labs.partA.ex03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex03.BreakContinue;

public class BreakContinueTest {
    @Test
    public void breakContinueTest(){
        String expected = "The number is 1\n" +
                "The number is 3\n" +
                "The number is 5\n" +
                "The number is 7 \n";
        String actual = BreakContinue.breakContinue();
        Assertions.assertEquals(expected, actual);
    }
}
