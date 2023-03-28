package baekjoon.p2875;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Bronze 3
// 인원수를 받고 분류
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int team = Math.min(N / 2, M);
        int remain = N + M - team * 3;

        while (K > 0) {
            if (remain > 0) {
                remain--;
                K--;
            } else {
                team--;
                remain += 3;
            }
        }

        System.out.println(team);
    }
}
