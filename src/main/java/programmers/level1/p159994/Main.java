package programmers.level1.p159994;

public class Main {
}

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        int cards1Index = 0;
        int cards2Index = 0;

        for (String check : goal) {
            if (cards1Index < cards1.length && cards1[cards1Index].equals(check)) {
                cards1Index++;
                continue;
            } else if (cards2Index < cards2.length && cards2[cards2Index].equals(check)) {
                cards2Index++;
                continue;
            } else {
                return "No";
            }
        }

        return "Yes";
    }
}