package programmers.level1.p131705;

public class Main {
}

class Solution {
    public int solution(int[] number) {
        int result = 0;

        for (int i = 0; i < number.length - 2; i++) {
            int sum1 = number[i];
            for (int j = i + 1; j < number.length - 1; j++) {
                int sum2 = sum1 + number[j];
                for (int h = j + 1; h < number.length; h++) {
                    int sum3 = sum2 +number[h];
                    if (0 == sum3) {
                        result++;
                    }
                }
            }
        }

        return result;
    }
}
