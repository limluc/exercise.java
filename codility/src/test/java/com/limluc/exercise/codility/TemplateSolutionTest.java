package com.limluc.exercise.codility;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Enclosed.class)
public class TemplateSolutionTest {

    @RunWith(Parameterized.class)
    public static class TemplateSolutionOneTest {
        final int inputX;
        final int expectation;

        public TemplateSolutionOneTest(int inputX, int expectation) {
            this.inputX = inputX;
            this.expectation = expectation;
        }

        @Parameterized.Parameters(name = "{0}")
        public static Collection<Object[]> data() {
            return Arrays.asList(new Object[][]{
                    //simple
                    {0, 90},
                    //minimal
                    {-2, 10000},
                    //extreme_ifempty
                    {30, 334},
                    //extreme_endpoints
                    {30, 334},
            });
        }

        @Test
        @Ignore("Ignoring This as It is Template Only")
        public void test() {
            Assert.assertEquals(expectation, new TemplateSolution().solution(inputX));
        }
    }
}