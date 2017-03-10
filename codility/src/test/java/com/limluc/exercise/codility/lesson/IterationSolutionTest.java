package com.limluc.exercise.codility.lesson;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class IterationSolutionTest {

    @RunWith(Parameterized.class)
    public static class SolutionExample {

        final int[] inputArrays;
        final int expectation;

        public SolutionExample(int[] inputArrays, int expectation) {
            this.inputArrays = inputArrays;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{-1, 3, -4, 5, 1, -6, 2, 1}, 1}
            });

        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new IterationSolution().example(inputArrays));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionBinaryGap {

        final int input;
        final int expectation;

        public SolutionBinaryGap(int input, int expectation) {
            this.input = input;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {529, 4},
                    {20, 1},
                    {15, 0},
                    {9, 2},
                    {14, 0},
                    {1, 0}
            });

        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new IterationSolution().iterationBinaryGap(input));
        }
    }
}