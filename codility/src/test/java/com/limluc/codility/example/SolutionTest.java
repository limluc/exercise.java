package com.limluc.codility.example;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSample() {
        int N = 8;
        int[] inputArray = new int[]{-1, 3, -4, 5, 1, -6, 2, 1};
        int outputActual = new Solution().solution(inputArray);

        Assert.assertEquals(1, outputActual);
    }

}