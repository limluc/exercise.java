package com.limluc.exercise.codility.lesson;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class ArraysSolution {

    /**
     *
     * ARRAYS
     *
     * https://codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
     * Find value that occurs in odd number of elements.
     *
     * @param A Elements
     * @return Value with Odd Number
     */

    int arrayOddOccurrencesInArray(int[] A) {
        java.util.Arrays.sort(A);
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

    /**
     *
     * ARRAYS
     *
     * https://codility.com/programmers/lessons/2-arrays/cyclic_rotation/
     * Rotate an array to the right by a given number of steps.
     *
     * @param array Elements
     * @param shift shift
     * @return New Array
     */

    int[] arrayCyclicRotation(int[] array, int shift) {
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
