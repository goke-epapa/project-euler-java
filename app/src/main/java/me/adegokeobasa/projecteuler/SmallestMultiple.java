package me.adegokeobasa.projecteuler;

public class SmallestMultiple {

    public static void main(String[] args) {
        solution();
    }

    public static int solution() {
        int[] factors = { 2, 3, 4, 5, 7, 9, 11, 13, 17, 19 };

        int product = 1;
        for (int i = 0; i < factors.length; i++) {
            product *= factors[i];
        }

        for (int i = 2520; i <= product; i += 20) {
            for (int j = 1; j <= 20; j++) {
                if (i % j != 0) {
                    break;
                }

                if (j == 20) {
                    return i;
                }
            }

        }

        return 0;
    }
}
