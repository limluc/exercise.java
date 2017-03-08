package com.limluc.exercise.codility.example;

import java.util.Arrays;

class Solution {

    public int solution(int[] A) {
        int sumOfTotal = Arrays.stream(A).sum();
        int eqSum = A[0];
        for (int i = 1; i < A.length -1; i++) {
            if (sumOfTotal - A[i] == eqSum * 2) {
                return i;
            }
            eqSum = eqSum + A[i];
        }
        return -1;
    }
}
