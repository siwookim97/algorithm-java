package programmers.level1.p136798;

import java.util.ArrayList;
import java.util.List;

public class Main {
}

class Solution {
    public int divisor(int number) {
        int count = 0;

        if (number == 1) {
            return 1;
        }

        for (int i = 1; i * i <= number; i++) {
            if (number == i * i) {
                count += 1;
            } else if (number % i == 0) {
                count += 2;
            }
        }

        return count;
    }


    public int solution(int number, int limit, int power) {
        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= number; i++) {
            int count = divisor(i);

            if (count > limit) {
                result.add(power);
            } else {
                result.add(count);
            }
        }

        return result.stream().mapToInt(i -> i).sum();
    }
}