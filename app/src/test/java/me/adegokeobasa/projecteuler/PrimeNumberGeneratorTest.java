package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PrimeNumberGeneratorTest {

    @Test
    public void testGenerate() {
        assertEquals(104743, PrimeNumberGenerator.solution(10001));
    }
}
