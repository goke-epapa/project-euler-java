package me.adegokeobasa.projecteuler;

public class EvenFibonacciNumbers {

    public static void main(String[] args) {
        System.out.println(fib(10));
    }

    public static int solution(int limit) {
        int sum = 0;
        int seqeuenceIndex = 1;

        while (true) {
            int fibonacciNo = fib(seqeuenceIndex++);

            if (fibonacciNo > limit) {
                break;
            }

            if (fibonacciNo % 2 == 0) {
                sum += fibonacciNo;
            }
        }

        return sum;
    }

    private static int fib(int n) {
        if (n <= 2) {
            return n;
        }

        return fib(n - 1) + fib(n - 2);
    }
}
