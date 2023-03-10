package programmers.level1.p133502;

import java.util.Stack;

public class Main {
}

class Solution {
    public int solution(int[] ingredient) {
        int answer = 0;
        Stack<Integer> burgerStack = new Stack<>();

        for (int i : ingredient) {
            burgerStack.push(i);

            if (burgerStack.size() >= 4) {
                if (burgerStack.get(burgerStack.size() - 4) == 1
                && burgerStack.get(burgerStack.size() - 3) == 2
                && burgerStack.get(burgerStack.size() - 2) == 3
                && burgerStack.get(burgerStack.size() - 1) == 1) {
                    burgerStack.pop();
                    burgerStack.pop();
                    burgerStack.pop();
                    burgerStack.pop();

                    answer++;
                }
            }
        }

        return answer;
    }
}