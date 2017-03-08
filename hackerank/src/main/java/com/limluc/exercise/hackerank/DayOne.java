package com.limluc.exercise.hackerank;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class DayOne {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = Integer.valueOf(in.nextLine());
        Integer[] elements = toInt(in.nextLine().split("\\s+"));

        double possibility = 0f;
        int unique = findDupl(elements);
        if (unique == 1) {
            possibility = 1f;
        } else {
            double prob = Math.pow(getFac(n), (-1)) * getFac(n - unique + 1);
//            System.out.println(prob);
            for (Integer i = 1; i < 1000000; i++) {
                possibility += Math.pow(prob, i) * i;
            }
        }
        System.out.printf("%.6f%n", possibility);
    }

    private static double getFac(int unique) {
        int factorial = 1;
        for (int c = 1; c <= unique; c++)
            factorial = factorial * c;
        return factorial;
    }

    private static Integer findDupl(Integer[] elements) {
        List<Integer> integers = Arrays.asList(elements);
        return new HashSet<>(integers).size();
    }

    private static Integer[] toInt(String[] split) {
        Integer[] c = new Integer[split.length];
        for (int i = 0; i < split.length; i++) {
            c[i] = Integer.valueOf(split[i]);
        }
        return c;
    }
}
