package programmers.level0.p120831;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10));
        System.out.println(new Solution().solution(4));
    }
}

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n).filter(e -> e % 2 == 0).sum();
    }
}
