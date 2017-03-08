package com.limluc.exercise.codility.twoArray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void twoExtreme() {
        int outputActual = new Solution().testTwo(new int[]{});

        Assert.assertEquals(0, outputActual);
    }

    @Test
    public void twoOne() {
        int outputActual = new Solution().testTwo(new int[]{1});

        Assert.assertEquals(1, outputActual);
    }

    @Test
    public void twoOneThree() {
        int outputActual = new Solution().testTwo(new int[]{2, 1, 2});

        Assert.assertEquals(1, outputActual);
    }

    @Test
    public void twoOneThreeMany() {
        int outputActual = new Solution().testTwo(new int[]{2, 1, 2, 1, 3, 4, 6, 4, 3, 6, 7});

        Assert.assertEquals(7, outputActual);
    }

    @Test
    public void testSample() {
        int[] outputActual = new Solution().testOne(new int[]{1, 2, 3}, 1);

        Assert.assertArrayEquals(new int[]{3, 1, 2}, outputActual);
    }

    @Test
    public void testSampleOne() {
        int[] outputActual = new Solution().testOne(new int[]{1}, 0);

        Assert.assertArrayEquals(new int[]{1}, outputActual);
    }

    @Test
    public void testSampleOneTwo() {
        int[] outputActual = new Solution().testOne(new int[]{1}, 10);

        Assert.assertArrayEquals(new int[]{1}, outputActual);
    }

    @Test
    public void testSampleTwo() {
        int[] outputActual = new Solution().testOne(new int[]{1, 2, 3, 4, 5, 6}, 6);

        Assert.assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, outputActual);
    }

    @Test
    public void testSampleEmpty() {
        int[] outputActual = new Solution().testOne(new int[]{}, 6);

        Assert.assertArrayEquals(new int[]{}, outputActual);
    }
}