package programmers.level1.p133502;

public class Main {
}

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;

        StringBuilder sb = new StringBuilder();

        for(int in : ingredient) { sb.append(in); }
        String inStr = sb.toString();

        while(inStr.contains("1231")) {
            answer++; // 값++
            int idx = inStr.indexOf("1231");
            inStr = inStr.substring(0, idx) + inStr.substring(idx+4);
        }

        return answer;
    }
}