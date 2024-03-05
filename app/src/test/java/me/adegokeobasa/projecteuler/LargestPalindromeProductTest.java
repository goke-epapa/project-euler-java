package me.adegokeobasa.projecteuler;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class LargestPalindromeProductTest {

    @Test
    public void testLargestPalindromeProduct() {
        int result = LargestPalindromeProduct.solution();
        assertEquals(906609, result);
    }
}
