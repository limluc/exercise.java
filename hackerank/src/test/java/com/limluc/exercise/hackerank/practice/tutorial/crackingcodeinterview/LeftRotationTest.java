package com.limluc.exercise.hackerank.practice.tutorial.crackingcodeinterview;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;


@RunWith(Enclosed.class)
public class LeftRotationTest {


    @RunWith(Parameterized.class)
    public static class LeftRotationSolutionTest {
        final int[] arrays;
        final int rotation;
        final int[] expectation;

        public LeftRotationSolutionTest(int[] arrays, int rotation, int[] expectation) {
            this.arrays = arrays;
            this.rotation = rotation;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{3}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    {new int[]{6, 11, 2, 3}, 4, new int[]{6, 11, 2, 3}},
                    {new int[]{2, 6, 2, 3, 5, 8, 9}, 1, new int[]{6, 2, 3, 5, 8, 9, 2}}
            });
        }

        @Test
        public void test() {
            Assert.assertArrayEquals(expectation, LeftRotation.arrayCyclicRotation(arrays, rotation));
        }
    }

}