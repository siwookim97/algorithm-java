package programmers.level1.p150370;

import java.util.*;

public class Main {
}

// 1. today 를 year, month, day 로 나눈다
// 2. terms 를 map 으로 담는다
// 3. privacies 를 하나씩 꺼내 year, month, day로 나누고 map 에서 약관을 꺼내 today 와 비교
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        int year, month, day;
        Map<String, Integer> termsMap = new HashMap<>();
        List<Integer> answer = new ArrayList<>();

        // 1 today 나누기
        String[] t=today.split("\\.");
        int todayCnt=Integer.parseInt(t[0])*12*28+Integer.parseInt(t[1])*28+Integer.parseInt(t[2]);

        // 2 terms map 에 담기
        for (int i = 0; i < terms.length; i++) {
            String[] term = terms[i].split(" ");
            termsMap.put(term[0], Integer.parseInt(term[1]));
        }

        // 3 privacies 하나씩 꺼내 나누고 판단
        for (int i = 0; i < privacies.length; i++) {
            String[] privacy = privacies[i].split("\\.| ");
            int yy = Integer.parseInt(privacy[0]);
            int mm = Integer.parseInt(privacy[1]);
            int dd = Integer.parseInt(privacy[2]);
            int length = termsMap.get(privacy[3]);
            int cnt = yy * 12 * 28 + (mm + length) * 28 + dd - 1;

            if (todayCnt > cnt) {
                answer.add(i + 1);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}
