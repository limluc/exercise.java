package com.limluc.exercise.codility.lesson;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class CountingElementsTest {

    @RunWith(Parameterized.class)
    public static class SolutionCountingElementsPermCheck {
        final int[] arrayA;
        final int expectation;

        public SolutionCountingElementsPermCheck(int[] arrayA, int expectation) {
            this.arrayA = arrayA;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{4}, 0},
                    {new int[]{1, 2, 4}, 0},
                    {new int[]{1}, 1},
                    {new int[]{Integer.MAX_VALUE}, 0},
                    {new int[]{2, 1, 4, 3}, 1},
                    {new int[]{2, 1, 4, 3, 3}, 0},
                    {new int[]{1, 3, 4}, 0},
                    {new int[]{1, 3, 4, 5}, 0}
            });
        }

        @Test
        public void test() {
            Assert.assertEquals("input[" + Arrays.toString(arrayA) + "]", expectation, new CountingElements().countingElementsPermCheck(arrayA));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionCountingElementsMissingInteger {
        final int[] arrayA;
        final int expectation;

        public SolutionCountingElementsMissingInteger(int[] arrayA, int expectation) {
            this.arrayA = arrayA;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{1, 2, 4}, 3},
                    {new int[]{4, 2, 2, 1}, 3},
                    {new int[]{Integer.MIN_VALUE}, 1},
                    {new int[]{Integer.MAX_VALUE, 1}, 2},
                    {new int[]{Integer.MAX_VALUE}, 1},
                    {new int[]{1}, 2},
                    {new int[]{2, 1, 5, 3, -1}, 4},
                    {new int[]{2, 5, 4, 3, 3}, 1},
                    {new int[]{1, -3, 4}, 2},
                    {new int[]{1, 3, 4, 5}, 2}
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(Arrays.toString(arrayA), expectation, new CountingElements().countingElementsMissingInteger(arrayA));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionCountingElementsFrogRiverOne {
        final int inputX;
        final int[] arrayA;
        final int expectation;

        public SolutionCountingElementsFrogRiverOne(int inputX, int[] arrayA, int expectation) {
            this.inputX = inputX;
            this.arrayA = arrayA;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {3, new int[]{1, 2, 3}, 2},
                    {2, new int[]{4, 2, 2, 1, 3}, 3},
                    {2, new int[]{7, 1, 1, 1, 1, 3, 2}, 6},
                    {5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}, 6},
                    {5, new int[]{Integer.MAX_VALUE}, -1},
                    {5, new int[]{1, 1, 1, 4, 5, 3, 4}, -1},
                    {4, new int[]{1, 3, 4, 5, 2}, 4}
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(Arrays.toString(arrayA), expectation, new CountingElements().countingElementsFrogRiverOne(inputX, arrayA));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionCountingElementsMaxCounters {
        final int inputX;
        final int[] arrayA;
        final int[] expectation;

        public SolutionCountingElementsMaxCounters(int inputX, int[] arrayA, int[] expectation) {
            this.inputX = inputX;
            this.arrayA = arrayA;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {2, new int[]{1, 2, 1, 2, 1}, new int[]{3, 2}},
                    {2, new int[]{1, 2, 1, 1, 3, 2, 1}, new int[]{4, 4}},
                    {2, new int[]{1, 2, 1, 3, 1, 2, 1, 3, 2}, new int[]{4, 5}},
                    {5, new int[]{3, 4, 4, 6, 1, 4, 4}, new int[]{3, 2, 2, 4, 2}}
            });
        }

        @Test
        public void test() {
            Assert.assertArrayEquals(Arrays.toString(arrayA), expectation, new CountingElements().countingElementsMaxCounters(inputX, arrayA));
        }
    }
}