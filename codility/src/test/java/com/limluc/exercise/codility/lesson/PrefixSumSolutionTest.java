package com.limluc.exercise.codility.lesson;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Enclosed.class)
public class PrefixSumSolutionTest {
    static int MAX_INT = 2000000000;

    @RunWith(Parameterized.class)
    public static class TemplateSolutionOneTest {
        final int inputA;
        final int inputB;
        final int inputK;
        final int expectation;

        public TemplateSolutionOneTest(int inputA, int inputB, int inputK, int expectation) {
            this.inputA = inputA;
            this.inputB = inputB;
            this.inputK = inputK;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{3}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {6, 11, 2, 3}, // 6, 8, 10
                    {2, 6, 2, 3}, // 2, 4, 6
                    {2, 6, 3, 2}, // 3, 6
                    {6, 6, 3, 1}, // 6
                    {5, 6, 2, 1}, // 6
                    {0, 0, 11, 1}, // 0
                    {1, 1, 11, 0}, // 0
                    {0, MAX_INT, 1, MAX_INT + 1}, // 0
                    {0, MAX_INT, MAX_INT, 2}, // 0
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new PrefixSumSolution().prefixSumCountDivSolution(inputA, inputB, inputK));
        }
    }
}