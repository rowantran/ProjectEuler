/*
Problem 3 - Largest prime factor

The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143?

Solved - 6857
(9ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Problem003 {
    private static boolean isFactor(long n, long factor) {
        return n % factor == 0;
    }

    private static boolean isPrime(long n) {
        boolean prime = true;
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0 && n != 2) {
                prime = false;
            }
        }

        return prime;
    }

    private static List<Long> listPrimeFactors(long n) {
        List<Long> factors = new ArrayList<>();
        for (long i = 2; i <= Math.sqrt(n); i++) {
            if (isFactor(n, i) && isPrime(i)) {
                factors.add(i);
            }
        }

        return factors;
    }

    private static long maxPrimeFactor(long n) {
        List<Long> factors = listPrimeFactors(n);

        return Collections.max(factors);
    }

    public static void main (String[] args) {
        Util.timeSolutionLong(() -> maxPrimeFactor(600851475143L));
    }
}
