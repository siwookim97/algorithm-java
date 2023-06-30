package programmers.level1.p176963;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.solution(
                new String[]{"may", "kein", "kain", "radi"}, // 문자열 배열
                new int[]{5, 10, 1, 3}, // 정수 배열
                new String[][]{ // 이차원 문자열 배열
                        {"may", "kein", "kain", "radi"},
                        {"may", "kein", "brin", "deny"},
                        {"kon", "kain", "may", "coni"}
                }
        );
    }
}

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];

        Map<String, Integer> match = new HashMap<>();

        for (int i = 0; i < name.length; i++) {
            match.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int count = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (match.containsKey(photo[i][j]))
                    count += match.get(photo[i][j]);
            }
            answer[i] = count;
        }

        return answer;
    }
}