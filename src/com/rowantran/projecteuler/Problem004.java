/*
Problem 4 - Largest palindrome product

A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.

Solved - 906609
(Ver. 1: 9ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem004 {
    private static boolean isPalindrome(int n) {
        String numString = Integer.toString(n);
        for (int i = 0; i < numString.length() / 2; i++) {
            if (numString.charAt(i) != numString.charAt(numString.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }

    private static int largestProductPalindrome() {
        int max = 0;
        for (int i = 100; i <= 999; i++) {
            for (int j = 100; j <= 999; j++) {
                int product = i * j;
                if (product > max && isPalindrome(product)) {
                    max = product;
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem004::largestProductPalindrome);
    }
}
