package programmers.level0.p120841;

public class Main {
    public static void main(String[] args) {

    }
}

class Solution {
    public int solution(int[] dot) {
        if (dot[0] > 0) {
            if (dot[1] > 0) {
                return 1;
            }
            return 4;
        }
        else {
            if (dot[1] > 0) {
                return 2;
            }
            return 3;
        }
    }
}