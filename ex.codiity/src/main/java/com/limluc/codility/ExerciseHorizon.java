package com.limluc.codility;

import java.util.Arrays;
import java.util.stream.Stream;

class ExerciseHorizon {
    private static final String REGEX = "[,|.|?]";
    private static final String WHITESPACE = "\\s+";

    int defaultSolution(int[] A) {
        return -1;
    }

    int exerciseOne(String S) {
        return Stream.of(S.split(REGEX))
                .mapToInt(this::countWords)
                .max().orElse(0);
    }

    private int countWords(String sentence) {
        return (int) Arrays.stream(sentence.trim().split(WHITESPACE))
                .filter(s -> !s.isEmpty())
                .count();
    }

    boolean exerciseTwo(int[] A) {
        int[] dest = new int[A.length];
        System.arraycopy(A, 0, dest, 0, A.length);

        Arrays.sort(dest);
        int countDiff = 2;
        for (int i = 0; i < dest.length; i++) {
            if (dest[i] != A[i]) {
                countDiff--;
            }
        }
        return countDiff >= 0;
    }
}
