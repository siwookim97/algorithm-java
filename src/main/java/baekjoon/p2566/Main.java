package baekjoon.p2566;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Bronze 3
// 9x9 행렬에서 최대값과 위치를 반환하는 알고리즘
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int result = -1;
        String resultIndex = "0 0";

        for (int i = 0; i < 9; i++) {
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < 9; j++) {
                int num = Integer.parseInt(st.nextToken());
                if (num > result) {
                    result = num;
                    resultIndex = (i + 1) + " " + (j + 1);
                }
            }
        }

        System.out.println(result);
        System.out.println(resultIndex);
    }
}
