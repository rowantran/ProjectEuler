/*
 * Problem 23 - Non-abundant sums
 * Solved (7.134s - i7-4750HQ)
 */

import java.util.ArrayList;
import java.util.List;

class Problem23 {
    static Integer[] listDivisors(int n) {
        List<Integer> divisorList = new ArrayList<>();

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                divisorList.add(i);

                if (n / i != i && n / i != n) {
                    divisorList.add(n / i);
                }
            }
        }

        Integer[] divisorArray = new Integer[divisorList.size()];
        divisorArray = divisorList.toArray(divisorArray);
        return divisorArray;
    }

    static boolean abundant(int n) {
        Integer[] divisors = listDivisors(n);

        int divisorSum = 0;
        for (int d : divisors) {
            divisorSum += d;
        }

        return (divisorSum > n);
    }

    static boolean canBeWrittenAsAbundantSum(int n) {
        for (int i = 12; i <= n/2; i++) {
            int j = n - i;
            if (abundant(i) && abundant(j)) {
                return true;
            }
        }

        return false;
    }

    static int nonAbundantSums() {
        int sum = 0;

        for (int i = 1; i <= 28123; i++) {
            if (!canBeWrittenAsAbundantSum(i)) {
                sum += i;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Util.timeSolution(() -> nonAbundantSums());
    }
}