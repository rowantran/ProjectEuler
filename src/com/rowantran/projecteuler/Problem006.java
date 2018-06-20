/*
Problem 6 - Sum square difference

The sum of the squares of the first ten natural numbers is,

1^2 + 2^2 + ... + 10^2 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)^2 = 55^2 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.

Solved - 25164150
(Ver. 1: 1ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem006 {
    private final static int MAX_NUMBER = 100;

    private static int sumSquares() {
        int sum = 0;
        for (int i = 1; i <= MAX_NUMBER; i++) {
            sum += Math.pow(i, 2);
        }

        return sum;
    }

    private static int squareSum() {
        int sum = 0;
        for (int i = 1; i <= MAX_NUMBER; i++) {
            sum += i;
        }

        return (int) Math.pow(sum, 2);
    }

    private static int sumSquareDifference() {
        return squareSum() - sumSquares();
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem006::sumSquareDifference);
    }
}
