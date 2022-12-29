package com.codedifferently.labs.partA.ex01;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import partA.ex01.ComputeSum;

public class ComputeSumTest {
    @Test
    public void countByTensTest01(){
        String expected = "55";
        String actual = ComputeSum.computeSum();
        Assertions.assertEquals(expected, actual);
    }
}
