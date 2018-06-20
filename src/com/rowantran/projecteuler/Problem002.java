/*
Problem 2 - Even Fibonacci numbers

Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

Solved - 4613732
(86ms - Ryzen 5 1600)
 */

package com.rowantran.projecteuler;

public class Problem002 {
    private static int fibonacciSequence(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacciSequence(n-1) + fibonacciSequence(n-2);
        }
    }

    private static int sumEvenFibonacciSequence() {
        final int MAX_VALUE = 4000000;

        int sum = 0;
        int i = 0;
        while (fibonacciSequence(i) <= MAX_VALUE) {
            int term = fibonacciSequence(i);
            if (term % 2 == 0) {
                sum += term;
            }

            i++;
        }

        return sum;
    }

    public static void main(String[] args) {
        Util.timeSolution(Problem002::sumEvenFibonacciSequence);
    }
}
