package me.adegokeobasa.projecteuler;

public class MultiplesOf3And5 {
    public static int Solution(int number) {
        int result = 0;
        for (int i = 0; i < number; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                result += i;
            }
        }

        return result;
    }
}
