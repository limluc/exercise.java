package com.limluc.exercise.hackerank.practice.dynamic.theblacklist;

import com.limluc.exercise.hackerank.practice.dynamic.theblacklist.Solution;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SolutionTheBlackListTest {

    @Test
    public void generateAllCombination() throws Exception {
        List<List<Integer>> input = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(4, 2, 3));
            add(Arrays.asList(1, 3, 1));
            add(Arrays.asList(7, 5, 6));
        }};

        Set<List<Integer>> result = Solution.generateCombination(input);
        System.out.println(result);
        Assert.assertTrue(new LinkedHashSet<List<Integer>>() {{
            add(Arrays.asList(1, 3, 1));
            add(Arrays.asList(4, 2, 3));
            add(Arrays.asList(4, 3, 1));
            add(Arrays.asList(1, 2, 3));
            add(Arrays.asList(4, 2, 1));
            add(Arrays.asList(1, 3, 3));
        }}.equals(result));
    }

    @Test
    public void generateAllCombinationB() throws Exception {
        List<List<Integer>> input = new ArrayList<List<Integer>>() {{
            add(Arrays.asList(4, 3));
            add(Arrays.asList(1, 1));
            add(Arrays.asList(2, 2));
        }};

        Set<List<Integer>> result = Solution.generateCombination(input);
        System.out.println(result);
        Assert.assertTrue(new LinkedHashSet<List<Integer>>() {{
            add(Arrays.asList(1, 1));
            add(Arrays.asList(4, 3));
            add(Arrays.asList(2, 2));
            add(Arrays.asList(4, 1));
            add(Arrays.asList(1, 3));
            add(Arrays.asList(2, 1));
            add(Arrays.asList(1, 2));
        }}.equals(result));
    }
}