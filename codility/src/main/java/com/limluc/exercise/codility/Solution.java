package com.limluc.exercise.codility;

import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Stream;

class Solution {

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

    int iterationBinaryGap(int N) {
        return Stream
                .of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1+"))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);
    }

    int arrayOddOccurrencesInArray(int[] A) {
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

    int timeComplexityFrogJump(int x, int y, int d) {
        return (int) Math.ceil((double) (y - x) / d);
    }

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
