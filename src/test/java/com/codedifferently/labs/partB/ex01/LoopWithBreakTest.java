package com.codedifferently.labs.partB.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partB.ex01.LoopWithBreak;
import partB.ex02.LoopWithContinue;

public class LoopWithBreakTest {
    @Test
    public void loopBreakTest(){
        String expected = "Sum = 10.0" ;
        String actual = LoopWithBreak.loopWithBreak();
        Assertions.assertEquals(expected, actual);
    }
}
