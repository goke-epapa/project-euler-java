package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class EvenFibonacciNumbersTest {

    @Test
    public void testSumOfEvenFibonacciNumbers() {
        int solution = EvenFibonacciNumbers.solution(4000000);
        assertEquals(4613732, solution);
    }
}
