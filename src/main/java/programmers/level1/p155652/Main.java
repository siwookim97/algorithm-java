package programmers.level1.p155652;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
}

//class Solution {
//    public String solution(String s, String skip, int index) {
//        String result = "";
//        String[] alphabetArr = new String[]
//                {"a", "b", "c", "d", "e", "f", "g", "h"
//                        , "i", "j", "k", "l", "m", "n", "o", "p", "q"
//                        , "r", "s", "t", "u", "v", "w", "x", "y", "z"};
//        List<String> list = new ArrayList<>(Arrays.asList(alphabetArr));
//        List<Integer> eraseList = new ArrayList<>();
//
//        for (int i = 0; i < skip.length(); i++) {
//            String alphabet = skip.charAt(i) + "";
//            list.remove(alphabet);
//            eraseList.add(skip.charAt(i) - 'a');
//        }
//
//        for (int i = 0; i < s.length(); i++) {
//            int order = (s.charAt(i) - 'a'); // 알파벳 순서
//            int count = 0;
//
//            for (int j = 0; j < eraseList.size(); j++) {
//                if (eraseList.get(j) >= order && eraseList.get(j) <= ((order + index) % 26)
//                        || order > (order + index) % 26 && eraseList.get(j) <= ((order + index) % 26)) {
//                    count++;
//                }
//            }
//
//            result += alphabetArr[(order + count + index) % 26];
//        }
//
//        return result;
//    }
//}

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