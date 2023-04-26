package org.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SumCalculatorTest {
    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatSumMethodWorksCorrect_1() {
        //When
        int actual = sumCalculator.sum(1);

        //Then
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumMethodWorksCorrect_2() {
        //When
        int actual = sumCalculator.sum(3);

        //Then
        int expected = 6;
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testThatSumMethodWorksCorrectWithException(){
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));


    }


}