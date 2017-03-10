package com.limluc.exercise.hackerank.practice.tutorial.crackingcodeinterview;

import java.util.Scanner;
import java.util.StringJoiner;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation
 * A left rotation operation on an array of size  shifts each of the array's elements  unit to the left. For example,
 * if left rotations are performed on array , then the array would become .
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }
        int[] ints = arrayCyclicRotation(a, k);
        StringJoiner joiner = new StringJoiner(" ");
        for (int cs : ints) {
            joiner.add(String.valueOf(cs));
        }
        System.out.println(joiner.toString());
    }

    static int[] arrayCyclicRotation(int[] array, int shift) {
        if (array.length == 0) {
            return array;
        }
        shift = shift % array.length;
        int[] tmp = new int[array.length];
        System.arraycopy(array, shift, tmp, 0, array.length - shift);
        System.arraycopy(array, 0, tmp, array.length - shift, shift);

        return tmp;
    }
}
