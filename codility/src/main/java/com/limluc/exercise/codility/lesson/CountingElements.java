package com.limluc.exercise.codility.lesson;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class CountingElements {

    /**
     *
     * COUNTING ELEMENTS
     *
     * https://codility.com/programmers/lessons/4-counting_elements/perm_check/
     * Whether array A is a permutation.
     *
     * @param A Arrays
     * @return returns 1 if array A is a permutation and 0 if it is not.
     */
    int countingElementsPermCheck(int[] A) {
        int[] newA = new int[A.length];
        int max = 0;
        for (int a : A) {
            if (a > newA.length) {
                return 0;
            }
            newA[a - 1]++;
            max = (a > max) ? a : max;
        }

        for (int i = 0; i < max; i++) {
            if (newA[i] != 1) {
                return 0;
            }
        }
        return 1;
    }

    /**
     *
     * COUNTING ELEMENTS
     *
     * https://codility.com/programmers/lessons/4-counting_elements/missing_integer/
     * Find the minimal positive integer not occurring in a given sequence.
     *
     * @param A Arrays
     * @return returns first positive integer missing
     */
    int countingElementsMissingInteger(int[] A) {
        int[] newA = new int[A.length + 1];
        for (int a : A) {
            if (a > 0 && a <= newA.length) {
                newA[a - 1] = 1;
            }
        }
        for (int i = 0; i < newA.length; i++) {
            if (newA[i] != 1) {
                return i + 1;
            }
        }
        return 1;
    }

    /**
     *
     * COUNTING ELEMENTS
     *
     * https://codility.com/programmers/lessons/4-counting_elements/frog_river_one/
     * Find the earliest time when a frog can jump to the other side of a river.
     * @param X position
     * @param A positions of leaves
     * @return jumps
     */
    int countingElementsFrogRiverOne(int X, int[] A) {
        int sum = X;
        int[] newA = new int[X];
        for (int i = 0; i < A.length; i++) {
            if (A[i] <= X && newA[A[i] - 1] == 0) {
                sum--;
                newA[A[i] - 1] = 1;
            }
            if (sum == 0) {
                return i;
            }
        }
        return -1;
    }

    /**
     *
     * COUNTING ELEMENTS
     *
     * https://codility.com/programmers/lessons/4-counting_elements/max_counters/
     * Calculate the values of counters after applying all alternating operations:
     * increase counter by 1;
     * set value of all counters to current maximum.
     * if A[K] = X, such that 1 ≤ X ≤ N, then operation K is increase(X),
     * if A[K] = N + 1 then operation K is max counter.
     *
     * @param N Size of Integer
     * @param A Series of Counter Operation
     * @return New Arraus
     */

    int[] countingElementsMaxCounters(int N, int[] A) {
        int currentMax = 0;
        int maxCounter = 0;

        int[] newA = new int[N];

        for (int aA : A) {
            if (aA <= N) {
                if (newA[aA - 1] < maxCounter) {
                    newA[aA - 1] = maxCounter;
                }
                newA[aA - 1]++;
                currentMax = Math.max(newA[aA - 1], currentMax);
            } else {
                maxCounter = currentMax;
            }
        }

        return setValue(maxCounter, newA);
    }

    private int[] setValue(int maxCounter, int[] newA) {
        for (int i = 0; i < newA.length; i++) {
            if(newA[i] < maxCounter){
                newA[i] = maxCounter;
            }
        }
        return newA;
    }
}
