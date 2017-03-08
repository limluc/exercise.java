package com.limluc.exercise.codility.twoArray;

import java.util.Arrays;

class Solution {

    public int solution(int[] array, int shift) {
        return testTwo(array);
    }

    int testTwo(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) {
            return 0;
        }
        if (A.length == 1) {
            return A[0];
        }
        int i = 0;
        while (i < A.length - 1) {
            if (A[i] == A[i + 1]) {
                i++;
                i++;
                continue;
            }
            return A[i];

        }
        return A[A.length - 1];
    }


    int[] testOne(int[] array, int shift) {
        if (array.length == 0) {
            return array;
        }
        shift = shift % array.length;
        int[] tmp = new int[array.length];
        System.arraycopy(array, 0, tmp, shift, array.length - shift);
        System.arraycopy(array, array.length - shift, tmp, 0, shift);
        return tmp;
    }
}
