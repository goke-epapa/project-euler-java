package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestPrimeFactorTest {

    @Test
    public void testLargestPrimeFactor() {
        long result = LargestPrimeFactor.solution(600851475143L);

        assertEquals(6857, result);
    }
}
