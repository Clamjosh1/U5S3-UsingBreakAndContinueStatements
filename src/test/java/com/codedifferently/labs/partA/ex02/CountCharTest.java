package com.codedifferently.labs.partA.ex02;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex02.CountChar;

public class CountCharTest {
    @Test
    public void countCharTest(){
        String expected = "Number of w : 3";
        String actual = CountChar.countChar();
        Assertions.assertEquals(expected, actual);
    }
}
