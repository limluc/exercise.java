package com.limluc.exercise.codility.lesson;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class TimeComplexity {

    /**
     *
     * TIME_COMPLEXITY
     *
     * https://codility.com/programmers/lessons/3-time_complexity/frog_jmp/
     * Count minimal number of jumps from position X to Y.
     *
     * @param x positionX
     * @param y position Y
     * @param d distance
     * @return count of Minimal Jumps
     */

    int timeComplexityFrogJump(int x, int y, int d) {
        return (int) Math.ceil((double) (y - x) / d);
    }

    /**
     *
     * TIME_COMPLEXITY
     *
     * https://codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
     * Find the missing element in a given permutation.
     *
     * @param A Arrays
     * @return Missing Element
     */

    int timeComplexityPermMissingElem(int[] A) {
        int[] newA = new int[A.length + 2];
        for (int a : A) {
            newA[a] = 1;
        }
        for (int i = 1; i <= newA.length; i++) {
            if (newA[i] == 0) {
                return i;
            }
        }
        return A[0];
    }

    /**
     *
     * TIME_COMPLEXITY
     *
     * https://codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
     * Minimize the value |(A[0] + ... + A[P-1]) - (A[P] + ... + A[N-1])|.
     *
     * @param A A non-empty zero-indexed array A consisting of N integers
     * @return Minimum value
     */

    int timeComplexityTapeEquilibrium(int[] A) {
        // Not perfect
        // Fail @ Small Elements
        // Double Elements
        int[] sumFront = new int[A.length + 1];
        int[] sumBack = new int[A.length + 1];

        sumFront[0] = sumBack[A.length] = 0;

        for (int i = 1; i < A.length + 1; i++) {
            sumFront[i] = sumFront[i - 1] + A[i - 1];
            sumBack[A.length - i] = sumBack[A.length + 1 - i] + A[A.length - i];
        }
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < A.length; i++) {
            int abs = Math.abs(sumFront[i] - sumBack[i]);
            smallest = (abs < smallest) ? abs : smallest;
        }
        return smallest;
    }
}
