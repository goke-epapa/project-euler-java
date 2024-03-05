package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class SmallestMultipleTest {

    @Test
    public void testSmallestMultiple() {
        assertEquals(232792560, SmallestMultiple.solution());
    }
}
