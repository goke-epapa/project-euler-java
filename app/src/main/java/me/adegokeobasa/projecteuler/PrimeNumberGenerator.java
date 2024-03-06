package me.adegokeobasa.projecteuler;

// Solves 10001st Prime
public class PrimeNumberGenerator {
    public static int solution(int position) {
        int[] primes = { 2, 3, 5, 7, 11 };

        if (position <= primes.length) {
            return primes[position - 1];
        }

        int currentNo = primes[primes.length - 1];
        int primeCounter = 5;
        while (true) {
            currentNo += 2;
            if (isPrime(currentNo)) {
                primeCounter++;

                if (primeCounter == position) {
                    return currentNo;
                }
            }
        }
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i < (Math.sqrt(number) + 1); i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
}
