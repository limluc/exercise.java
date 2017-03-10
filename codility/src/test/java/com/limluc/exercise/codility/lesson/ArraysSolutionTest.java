package com.limluc.exercise.codility.lesson;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class ArraysSolutionTest {

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
            Assert.assertEquals(expectation, new ArraysSolution().arrayOddOccurrencesInArray(input));
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
            Assert.assertArrayEquals(expectation, new ArraysSolution().arrayCyclicRotation(input, shiftInput));
        }
    }
}