package com.limluc.exercise.hackerank.practice.lost;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountingWay {
    static long sum = 0;

    private static List<Integer> toArrayList(int[] intArray) {
        List<Integer> intList = new ArrayList<>(intArray.length);
        for (int anIntArray : intArray) {
            intList.add(anIntArray);
        }
        return intList;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int nk = in.nextInt();
        int[] weights = new int[nk];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = in.nextInt();
        }

        int lowBound = in.nextInt();
        int highBound = in.nextInt();

        for (int i = lowBound; i <= highBound; i++) {
            sum_up_recursive(
                    toArrayList(weights),
                    i,
                    new ArrayList<>()
            );
        }
        System.out.println(sum % (long) (Math.pow(10, 9) + 7));
    }


    static void sum_up_recursive(List<Integer> numbers, int target, List<Integer> partial) {
        int s = 0;
        for (int x : partial) {
            s += x;
        }
        if (s == target)
            sum++;
        if (s >= target)
            return;

        for (int i = 0; i < numbers.size(); i++) {
            List<Integer> remaining = new ArrayList<>();
            int n = numbers.get(i);

            for (int j = i + 1; j < numbers.size(); j++) {
                remaining.add(numbers.get(j));
            }

            List<Integer> partial_rec = new ArrayList<>(partial);
            partial_rec.add(n);
            sum_up_recursive(remaining, target, partial_rec);
        }
    }
}
