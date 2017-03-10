package com.limluc.exercise.hackerank.contest.w21.luckbalance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/contests/w21/challenges/luck-balance
 **/

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] init = toInt(in.nextLine().split("\\s+"));
        List<Integer> list = new ArrayList<>();
        Integer value = 0;
        for (Integer i = 0; i < init[0]; i++) {
            Integer[] x = toInt(in.nextLine().split("\\s+"));
            if (x[1] == 1) {
                list.add(x[0]);
            }
            value += x[0];
        }
        Collections.sort(list);
        for (Integer x = 0; x < (list.size() - init[1]) ; x++) {
            value -= (list.get(x) * 2);
        }
        System.out.println(value);
    }

    private static Integer[] toInt(String[] split) {
        Integer[] c = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            c[i] = Integer.valueOf(split[i]);
        }
        return c;
    }
}