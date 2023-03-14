package programmers.level1.p161990;

import java.util.Arrays;

public class Main {
}

// lux luy 는 제일 끝점으로, 더 작은게 있으면 바꾸기
// rdx rdy 는 0, 0으로, 더 큰게 있으면 바꾸기
class Solution {
    public int[] solution(String[] wallpaper) {
        int lux = Integer.MAX_VALUE;
        int luy = Integer.MAX_VALUE;
        int rdx = 0;
        int rdy = 0;

        for (int i = 0; i < wallpaper.length; i++) { // x
            String element = wallpaper[i];
            for (int j = 0; j < element.length(); j++) { // y
                char area = element.charAt(j);
                if (area == '#') {
                    lux = Math.min(lux, i);
                    luy = Math.min(luy, j);
                    rdx = Math.max(rdx, i+1);
                    rdy = Math.max(rdy, j+1);
                }
            }
        }

        int[] answer = new int[]{lux, luy, rdx, rdy};
        Arrays.stream(answer).forEach(System.out::println);

        return answer;
    }
}