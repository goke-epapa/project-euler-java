package me.adegokeobasa.projecteuler;

public class LargestPalindromeProduct {
    public static int solution() {
        int largestPalindrome = 0;
        int a = 999;

        while (a >= 100) {
            int b = 999;

            while (b > a) {
                int product = a * b;
                if (product <= largestPalindrome) {
                    break;
                }

                if (isPalindrome(product)) {
                    largestPalindrome = product;
                }

                b--;
            }
            a--;
        }

        return largestPalindrome;
    }

    private static boolean isPalindrome(int n) {
        String s = String.valueOf(n);
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
