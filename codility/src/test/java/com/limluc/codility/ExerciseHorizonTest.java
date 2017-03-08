package com.limluc.codility;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class ExerciseHorizonTest {

    @RunWith(Parameterized.class)
    public static class SolutionExerciseOneWordCount {
        String inputX;
        int expectation;

        public SolutionExerciseOneWordCount(String inputX, int expectation) {
            this.inputX = inputX;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"We test coders. Give us a try?", 4},
                    {"", 0},
                    {" ", 0},
                    {"  ", 0},
                    {"    . asasas. asa ass aswca. assa.", 3},
                    {"    . asasas. asa ass aa. assa? a a a a a", 5},
                    {"We test coders. Give us a try?", 4},
                    {"Forget  CVs..Save time . x x", 2}
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new ExerciseHorizon().exerciseOne(inputX));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionExerciseTwoSort {
        int[] A;
        boolean expectation;

        public SolutionExerciseTwoSort(int[] A, boolean expectation) {
            this.A = A;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{1}, true},
                    {new int[]{1, 3, 3, 5, 7}, true},
                    {new int[]{1, 3, 5, 3, 7}, true},
                    {new int[]{3, 1, 5, 3, 7}, false},
                    {new int[]{1, 3, 5, 3, 4}, false},
                    {new int[]{1, 3, 5, 3, 3, 3, 4}, false},
                    {new int[]{1, 3, 5}, true},
                    {new int[]{1, 1, 1, 1, 1}, true},
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(Arrays.toString(A), expectation, new ExerciseHorizon().exerciseTwo(A));
        }
    }
}