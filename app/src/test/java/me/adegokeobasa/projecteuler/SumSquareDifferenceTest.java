package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SumSquareDifferenceTest {

    @Test
    public void testSumSquareDifference() {
        assertEquals(2640, SumSquareDifference.solution(10));
        assertEquals(25164150, SumSquareDifference.solution(100));
    }
}
