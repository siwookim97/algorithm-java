package programmers.level1.p155652;

public class Main {
}

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); // 이동할 문자를 한개 가져옴
            int count = 1; // 이동 횟수 세기

            while (count <= index) {
                ++c; // 문자 이동
                if (c > 'z') // 이동 했는데 크면 a로 돌림
                    c -= 26;

                if (skip.contains(c + "")) // skip에 있으면 count증가하지 않음
                    continue;
                else
                    count++;
            }
            answer += c;
        }
        return answer;
    }
}