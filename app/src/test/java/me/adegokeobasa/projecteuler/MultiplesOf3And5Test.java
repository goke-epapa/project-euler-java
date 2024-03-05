package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MultiplesOf3And5Test {

    @Test
    public void testSumOfMultiplesOf3And5() {
        int solution = MultiplesOf3And5.Solution(1000);
        assertEquals(233168, solution);
    }
}
