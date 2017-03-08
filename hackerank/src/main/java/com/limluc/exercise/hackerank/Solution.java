package com.limluc.exercise.hackerank;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        String[] nk = in.nextLine().split("\\s+");
        Integer gangsterNumberN = validateN(Integer.valueOf(nk[0]));
        Integer mercenariesNumberK = validateK(Integer.valueOf(nk[1]));
        List<List<Integer>> arrayInt = new ArrayList<>();
        for (int i = 0; i < mercenariesNumberK; i++) {
            arrayInt.add(parseToArrayInt(in.nextLine()));
        }
    }

    public static Set<List<Integer>> generateCombination(List<List<Integer>> input) {
        Set<List<Integer>> a = new LinkedHashSet<>();
        for (int i = 0; i < input.get(0).size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                List<Integer> main = input.get(j);

                a.add(read(main, input, i));
                a.add(readBack(main, input, i));
            }
        }
        return a;
    }

    private static List<Integer> read(List<Integer> main, List<List<Integer>> input, int i) {
        List<Integer> lowest = new ArrayList<>();
        for (int z = 0; z < input.size(); z++) {
//            a.add(read(main, input.get(z), i));
//            a.add(readBack(main, input, i));
        }
        lowest.addAll(getArrayFrom(main, i));
        lowest.addAll(getArrayTo(input.get(1), i));
        return lowest;
    }

    private static List<Integer> readBack(List<Integer> main, List<List<Integer>> input, int i) {
        List<Integer> lowest = new ArrayList<>();
        lowest.addAll(getArrayFrom(input.get(1), i));
        lowest.addAll(getArrayTo(main, i));
        return lowest;
    }

    private static List<Integer> getArrayFrom(List<Integer> input, int i) {
        List<Integer> newArray = new ArrayList<>();
        if (i == 0) {
            return newArray;
        }
        for (int iterator = 0; iterator < i; iterator++) {
            newArray.add(input.get(iterator));
        }
        return newArray;
    }

    private static List<Integer> getArrayTo(List<Integer> input, int i) {
        List<Integer> newArray = new ArrayList<>();
        if (i == 0) {
            return input;
        }
        for (int iterator = i; iterator < input.size(); iterator++) {
            newArray.add(input.get(iterator));
        }
        return newArray;
    }


    private static Integer validateCost(Integer integer) {
        if (integer < 0 || integer > 10000) {
            throw new RuntimeException("Invalid Count");
        }
        return integer;
    }

    private static Integer validateK(Integer integer) {
        if (integer < 1 || integer > 10) {
            throw new RuntimeException("Invalid Count");
        }
        return integer;
    }

    private static Integer validateN(Integer integer) {
        if (integer < 1 || integer > 20) {
            throw new RuntimeException("Invalid Count");
        }
        return integer;
    }

    private static List<Integer> parseToArrayInt(String next) {
        List<Integer> arrayInt = new ArrayList<>();
        for (String intString : next.split("\\s+")) {
            arrayInt.add(Integer.valueOf(intString));
        }
        return arrayInt;
    }


}
