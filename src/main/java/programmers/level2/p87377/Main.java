package programmers.level2.p87377;

import java.util.*;

public class Main {
}

class Solution {
    public boolean isInteger(double num) {
        return Math.floor(num) == num;
    }

    public String[] solution(int[][] line) {
        Set<String> set = new HashSet<>();
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;

        // 1. List 2중 for문 순회하며 교점 찾아
        for (int i = 0; i < line.length - 1; i++) {
            int A = line[i][0];
            int B = line[i][1];
            int E = line[i][2];
            for (int j = i + 1; j < line.length; j++) {
                int C = line[j][0];
                int D = line[j][1];
                int F = line[j][2];
                long tmp1 = (B * F) - (E * D);
                long tmp2 = (E * C) - (A * F);
                long bottom = (A * D) - (B * C);

                if (bottom == 0) {
                    continue;
                }

                double checkingX = (double)(tmp1) / bottom;
                double checkingY = (double)(tmp2) / bottom;

                if (!(isInteger(checkingX) && isInteger(checkingY))) {
                    continue;
                }

                // 2. List<Map<Integer, Integer>> 넣기 -> min, max 찾으며 넣어야함
                set.add((long) checkingX + "," + (long) checkingY);
                maxX = Math.max((int) checkingX, maxX);
                maxY = Math.max((int) checkingY, maxY);
                minX = Math.min((int) checkingX, minX);
                minY = Math.min((int) checkingY, minY);
            }
        }
        // 3. 좌표 배열 생성
        String[] answer = new String[maxY - minY + 1];
        int index = 0;

        StringBuilder sb;
        for (int j = maxY; j >= minY; j--) {
            sb = new StringBuilder();
            for (int i = minX; i <= maxX; i++) {
                if (set.contains(i + "," + j)) {
                    sb.append("*");
                } else {
                    sb.append(".");
                }
            }

            answer[index++] = sb.toString();
        }

        return answer;
    }
}