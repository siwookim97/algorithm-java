package programmers.level1.p138477;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
}

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> topLst = new ArrayList<>();

        for(int i=0; i<score.length; i++) {

            if(topLst.size() < k) {
                topLst.add(score[i]);
            }else {
                if(topLst.get(0) < score[i]) {
                    topLst.set(0, score[i]);
                }
            }
            Collections.sort(topLst);

            answer[i] = topLst.get(0);
        }

        return answer;
    }
}