package com.codedifferently.labs.partB.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex02.LoopWithContinue;

public class LoopWithContinueTest {
    @Test
    public void loopContinueTest(){
        String expected = "1\n" +
                "2\n" +
                "3\n" +
                "4\n" +
                "9\n" +
                "10" ;
        String actual = LoopWithContinue.loopWithContinue();
        Assertions.assertEquals(expected, actual);
    }
}
