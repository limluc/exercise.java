package com.limluc.exercise.codility.lesson;

class PrefixSumSolution {

    /**
     * PREFIX SUM
     * <p>
     * https://codility.com/programmers/lessons/5-prefix_sums/count_div/
     * Compute number of integers divisible by k in range [a..b].
     *
     * @param A Elements
     * @return Value with Odd Number
     */

    int prefixSumCountDivSolution(int A, int B, int K) {
        // Need to account for 0/K = 1
        return (B / K) - (A / K) + (A % K == 0 ? 1 : 0);
    }
}
