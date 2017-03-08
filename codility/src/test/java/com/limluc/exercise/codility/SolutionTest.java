package com.limluc.exercise.codility;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class SolutionTest {

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
            Assert.assertEquals(expectation, new Solution().example(inputArrays));
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
            Assert.assertEquals(expectation, new Solution().iterationBinaryGap(input));
        }
    }


    @RunWith(Parameterized.class)
    public static class SolutionTwoArrayManipulation {
        final int[] input;
        final int expectation;

        public SolutionTwoArrayManipulation(int[] input, int expectation) {
            this.input = input;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{}, 0},
                    {new int[]{1}, 1},
                    {new int[]{2, 1, 2}, 1},
                    {new int[]{2, 1, 2}, 1},
                    {new int[]{2, 1, 2, 1, 3, 4, 6, 4, 3, 6, 7}, 7}
            });

        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new Solution().arrayOddOccurrencesInArray(input));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionTwoArrayShift {
        final String name;
        final int[] input;
        final int shiftInput;
        final int[] expectation;

        public SolutionTwoArrayShift(String name, int[] input, int shiftInput, int[] expectation) {
            this.name = name;
            this.input = input;
            this.shiftInput = shiftInput;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {"extreme", new int[]{}, 1, new int[]{}},
                    {"1, 2, 3 -> 1", new int[]{1, 2, 3}, 1, new int[]{3, 1, 2}},
                    {"1 -> 1", new int[]{1}, 0, new int[]{1}},
                    {"1 -> 1", new int[]{1}, 10, new int[]{1}},
                    {"1, 2, 3, 4, 5, 6 -> 1, 2, 3, 4, 5, 6", new int[]{1, 2, 3, 4, 5, 6}, 12, new int[]{1, 2, 3, 4, 5, 6}},
                    {"1, 2, 3, 4, 5, 6 -> 4, 5, 6, 1, 2, 3", new int[]{1, 2, 3, 4, 5, 6}, 15, new int[]{4, 5, 6, 1, 2, 3}}
            });

        }

        @Test
        public void test() {
            Assert.assertArrayEquals(expectation, new Solution().arrayCyclicRotation(input, shiftInput));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionTimeComplexityFrogJump {
        final int inputX;
        final int inputY;
        final int jumpD;
        final int expectation;

        public SolutionTimeComplexityFrogJump(int inputX, int inputY, int jumpD, int expectation) {
            this.inputX = inputX;
            this.inputY = inputY;
            this.jumpD = jumpD;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {0, 90, 30, 3},
                    {30, 100, 30, 3},
                    {0, 119, 30, 4},
                    {-100, 30, 3, 44},
                    {-2, 10000, 30, 334},
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new Solution().timeComplexityFrogJump(inputX, inputY, jumpD));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionTimeComplexityPermMissingElm {
        final int[] arrayA;
        final int expectation;

        public SolutionTimeComplexityPermMissingElm(int[] arrayA, int expectation) {
            this.arrayA = arrayA;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{1, 2, 4}, 3},
                    {new int[]{1, 3, 4}, 2},
                    {new int[]{1, 3, 4, 5}, 2}
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new Solution().timeComplexityPermMissingElem(arrayA));
        }
    }

    @RunWith(Parameterized.class)
    public static class SolutionTimeComplexityTapeEquilibrium {
        final int[] arrayA;
        final int expectation;

        public SolutionTimeComplexityTapeEquilibrium(int[] arrayA, int expectation) {
            this.arrayA = arrayA;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{1, 2, 4}, 1},
                    {new int[]{10010, 10}, 10000},
                    {new int[]{0, 0}, 0},
                    {new int[]{1, 3, 4}, 0},
                    {new int[]{1, 3, 4, 5}, 3}
            });
        }

        @Test
        public void test() {
            Assert.assertEquals(expectation, new Solution().timeComplexityTapeEquilibrium(arrayA));
        }
    }

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
            Assert.assertEquals("input[" + Arrays.toString(arrayA) + "]", expectation, new Solution().countingElementsPermCheck(arrayA));
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
            Assert.assertEquals(Arrays.toString(arrayA), expectation, new Solution().countingElementsMissingInteger(arrayA));
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
            Assert.assertEquals(Arrays.toString(arrayA), expectation, new Solution().countingElementsFrogRiverOne(inputX, arrayA));
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
            Assert.assertArrayEquals(Arrays.toString(arrayA), expectation, new Solution().countingElementsMaxCounters(inputX, arrayA));
        }
    }
}