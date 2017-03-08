package com.limluc.codility.oneBinary;

import java.util.Objects;
import java.util.stream.Stream;

public class Solution {

    public int solution(int N) {
        return binaryGap(N);
    }

    public int binaryGap(int N) {
        return Stream
                .of(Integer.toBinaryString(N).replaceAll("0+$", "").split("1+"))
                .filter(Objects::nonNull)
                .map(String::length)
                .max(Integer::compare)
                .orElse(0);
    }
}
