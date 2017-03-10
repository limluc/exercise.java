package com.limluc.exercise.codility.lesson;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class IterationSolution {

    int defaultSolution(int[] A) {
        return -1;
    }

    int example(int[] A) {
        int sumOfTotal = Arrays.stream(A).sum();
        int eqSum = A[0];
        for (int i = 1; i < A.length - 1; i++) {
            if (sumOfTotal - A[i] == eqSum * 2) {
                return i;
            }
            eqSum = eqSum + A[i];
        }
        return -1;
    }

    /**
     *
     * ITERATIONS
     *
     * https://codility.com/programmers/lessons/1-iterations/binary_gap/
     * Find longest sequence of zeros in binary representation of an integer.
     *
     * @param N real number
     * @return count of the longest sequence of zeros
     */

    int iterationBinaryGap(int N) {
        return Stream
                .of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1+"))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);
    }
}
