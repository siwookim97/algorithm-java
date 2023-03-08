package programmers.level1.p133499;

import java.util.Arrays;
import java.util.List;

public class Main {
}

class Solution {
    public int solution(String[] babbling) {
        List<String> checkBabbling = Arrays.asList(babbling);
        int count = 0;

        for (int i = 0; i < checkBabbling.size(); i++) {
            String checkString = checkBabbling.get(i);

            if (checkString.contains("ayaaya") || checkString.contains("yeye") || checkString.contains("woowoo") || checkString.contains("mama")) {
                continue;
            }

            checkString = checkString.replace("aya", " ");
            checkString = checkString.replace("ye", " ");
            checkString = checkString.replace("woo", " ");
            checkString = checkString.replace("ma", " ");
            checkString = checkString.replace(" ", "");

            if (checkString.length() == 0) {
                count++;
            }
        }

        return count;
    }
}