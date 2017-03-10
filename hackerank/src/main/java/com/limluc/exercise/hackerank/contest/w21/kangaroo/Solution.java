package com.limluc.exercise.hackerank.contest.w21.kangaroo;

import java.util.*;

/**
 * https://www.hackerrank.com/contests/w21/challenges/kangaroo
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        try {
            double time = (double) (x2 - x1) / (v1 - v2);
            //System.out.println(time);
            if (time < 0 || (time != (int) time)) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        } catch (Exception e) {
            System.out.println("NO");
        }
    }
}
