/*
Problem 7 - 10001st prime

By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

What is the 10 001st prime number?

Solved - 104743
(Ver. 1: 115ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem007 {
    private static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n != 2) {
                prime = false;
            }
        }

        return prime;
    }

    private static int findPrime() {
        final int PRIME = 10001;

        int primesFound = 0;
        int n = 2;
        while (primesFound < PRIME) {
            if (isPrime(n)) {
                primesFound++;
            }

            if (primesFound < PRIME) {
                n++;
            }
        }

        return n;
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem007::findPrime);
    }
}
