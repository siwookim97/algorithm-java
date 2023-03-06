package programmers.level1.p135808;

import java.util.Arrays;

public class Main {
}

class Solution {
    public int solution(int k, int m, int[] score) {
        int result = 0;
        Arrays.sort(score);

        for (int i = score.length - m; i >= 0; i -= m) {
            result += (m * score[i]);
        }

        return result;
    }
}