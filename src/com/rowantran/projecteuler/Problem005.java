/*
Problem 5 - Smallest multiple

2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

Solved - 232792560
(Ver. 1: 2921ms - Ryzen 5 1600)
(Ver. 2: 93ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem005 {
    private static int[] PRIME_FACTORS = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    private static boolean divisibleThrough(int n) {
        for (int i : PRIME_FACTORS) {
            if (n % i != 0) {
                return false;
            }
        }

        return true;
    }

    private static int minimumDivisibleThrough() {
        int num = 20;
        while (!divisibleThrough(num)) {
            num += 20;
        }

        return num;
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem005::minimumDivisibleThrough);
    }
}
