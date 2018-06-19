/*
 * Problem 19 - Counting Sundays
 * Solved (0.002s - i7-4750HQ)
 */

package com.rowantran.projecteuler;

class Problem19 {
    final static int countSundays() {
        int day = 1;
        int month = 1;
        int year = 1900;
        int dayName = 1;

        int sundaysFirstOfMonth = 0;

        while (year <= 2000) {
            day += 1;
            dayName += 1;

            if (dayName > 7) {
                dayName = 1;
            }

            if (month == 2) { // February
                if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { // Leap year
                    if (day > 29) {
                        day = 1;
                        month += 1;
                    }
                } else {
                    if (day > 28) {
                        day = 1;
                        month += 1;
                    }
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) { // 30 days
                if (day > 30) {
                    day = 1;
                    month += 1;
                }
            } else {
                if (day > 31) {
                    day = 1;
                    month += 1;

                    if (month > 12) {
                        month = 1;
                        year += 1;
                    }
                }
            }


            if (year > 1900 && day == 1 && dayName == 7) {
                sundaysFirstOfMonth += 1;
            }
        }

        return sundaysFirstOfMonth;
    }

    public static void main(String[] args) {
        Util.timeSolution(() -> countSundays());
    }
}    
