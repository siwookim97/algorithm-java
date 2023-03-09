package programmers.level1.p118666;

import java.util.HashMap;
import java.util.Map;

public class Main {
}

//RT CF JM AN
class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0); map.put('T', 0);
        map.put('C', 0); map.put('F', 0);
        map.put('J', 0); map.put('M', 0);
        map.put('A', 0); map.put('N', 0);

        for (int i = 0; i < survey.length; i++) {
            int score = choices[i];
            String type = survey[i];

            if (score < 4) {
                map.replace(type.charAt(0), map.get(type.charAt(0)) + (4 - score));
            } else if (score < 8) {
                map.replace(type.charAt(1), map.get(type.charAt(1)) + (score - 4));
            }
        }

        if (map.get('R') >= map.get('T')) {
            answer += 'R';
        } else {
            answer += 'T';
        }

        if (map.get('C') >= map.get('F')) {
            answer += 'C';
        } else {
            answer += 'F';
        }

        if (map.get('J') >= map.get('M')) {
            answer += 'J';
        } else {
            answer += 'M';
        }

        if (map.get('A') >= map.get('N')) {
            answer += 'A';
        } else {
            answer += 'N';
        }

        return answer;
    }
}