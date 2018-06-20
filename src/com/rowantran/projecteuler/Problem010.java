/*
Problem 10 - Summation of primes

The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.

Solved - 142913828922
(Ver. 1: 9800ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem010 {
    private static boolean isPrime(int n) {
        boolean prime = true;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n != 2) {
                prime = false;
            }
        }

        return prime;
    }

    private static long sumPrimes() {
        final int MAX_PRIME = 2000000;
        long sum = 0;

        for (int i = 2; i <= MAX_PRIME; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Util.timeSolutionLong(Problem010::sumPrimes);
    }
}
