package programmers.level0.p120830;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int n, int k) {
        return n * 12000 + k * 2000 - (n / 10 * 2000);
    }
}