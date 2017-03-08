package com.limluc.codility.oneBinary;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSampleOne() {
        int outputActual = new Solution().solution(529);

        Assert.assertEquals(4, outputActual);
    }

    @Test
    public void testSampleTwo() {
        int outputActual = new Solution().solution(20);

        Assert.assertEquals(1, outputActual);
    }

    @Test
    public void testSampleThree() {
        int outputActual = new Solution().solution(15);

        Assert.assertEquals(0, outputActual);
    }

    @Test
    public void testSampleFour() {
        int outputActual = new Solution().solution(9);

        Assert.assertEquals(2, outputActual);
    }

    @Test
    public void testSampleFive() {
        int outputActual = new Solution().solution(41);

        Assert.assertEquals(2, outputActual);
    }

    @Test
    public void testSampleExtreme() {
        int outputActual = new Solution().solution(1);

        Assert.assertEquals(0, outputActual);
    }
}