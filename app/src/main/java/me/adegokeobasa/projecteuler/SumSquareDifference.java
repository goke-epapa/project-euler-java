package me.adegokeobasa.projecteuler;

// Find the difference between the sum of the squares
// of the first one hundred natural numbers and the square of the sum.
public class SumSquareDifference {
    public static int solution(int noOfNaturalNumbers) {
        int sumOfSquares = 0;
        int sum = 0;

        for (int i = 1; i <= noOfNaturalNumbers; i++) {
            sumOfSquares += i * i;
            sum += i;
        }

        return (sum * sum) - sumOfSquares;
    }
}
