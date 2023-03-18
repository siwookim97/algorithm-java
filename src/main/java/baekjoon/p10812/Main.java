package baekjoon.p10812;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader 를 통해서 문자열을 읽도록 한다
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringTokenizer 를 통해서 문자열에서 숫자를 분리하도록 한다
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 10
        int m = Integer.parseInt(st.nextToken()); // 5

        int[] baskets = new int[n + 1];
        for (int init = 1; init <= n; init++) {
            baskets[init] = init;
        }

        // m 번 돌린다
        for (int time = 0; time < m; time++) {
            st = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int[] copy = Arrays.copyOf(baskets, baskets.length);
            for (int c = i; c <= j; c++) {
                if (k > j) {
                    k = i;
                }
                baskets[c] = copy[k];
                k++;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int s = 1; s <= n; s++) {
            sb.append(baskets[s]).append(' ');
        }

        System.out.println(sb);
    }
}