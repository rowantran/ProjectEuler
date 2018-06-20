/*
Problem 9 - Special Pythagorean triplet

A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.

Solved - 31875000
(Ver. 1: 115ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem009 {
    private static boolean isPythagoreanTriplet(int a, int b, int c) {
        return (((int) Math.pow(a, 2) + (int) Math.pow(b, 2)) == (int) Math.pow(c, 2));
    }

    private static int specialPythagoreanTriplet() {
        final int SUM_OF_VALUES = 1000;
        for (int a = 1; a <= SUM_OF_VALUES; a++) {
            for (int b = 1; b <= SUM_OF_VALUES; b++) {
                for (int c = 1; c <= SUM_OF_VALUES; c++) {
                    if (a + b + c == 1000 && isPythagoreanTriplet(a, b, c)) {
                        return a*b*c;
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem009::specialPythagoreanTriplet);
    }
}
