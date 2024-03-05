package me.adegokeobasa.projecteuler;

public class LargestPrimeFactor {

    public static void main(String[] args) {
        System.out.println(solution(250));
    }

    public static long solution(long n) {
        int lastFactor = 1;
        int factor = 2;

        // Div by 2
        if (n % factor == 0) {
            lastFactor = 2;
            n /= 2;

            while (n % factor == 0) {
                n = n / factor;
            }
        }

        factor = 3;
        int maxFactor = (int) Math.sqrt(n);
        while (n > 1 && factor <= maxFactor) {
            if (n % factor == 0) {
                n /= factor;
                lastFactor = factor;

                while (n % factor == 0) {
                    n /= factor;
                }
                maxFactor = (int) Math.sqrt(n);
            }
            factor += 2;
        }

        if (n == 1) {
            return lastFactor;
        }

        return n;
    }
}