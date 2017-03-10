package com.limluc.exercise.codility.lesson;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Enclosed.class)
public class TimeComplexityTest {

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
            Assert.assertEquals(expectation, new TimeComplexity().timeComplexityFrogJump(inputX, inputY, jumpD));
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
            Assert.assertEquals(expectation, new TimeComplexity().timeComplexityPermMissingElem(arrayA));
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
            Assert.assertEquals(expectation, new TimeComplexity().timeComplexityTapeEquilibrium(arrayA));
        }
    }
}