package baekjoon.p9063;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Bronze 3
// 땅을 구하는 알고리즘
public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int max = 0, min = Integer.MAX_VALUE, max1 = 0, min1 = Integer.MAX_VALUE;
        while(n --> 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());

            max = Math.max(max, a);
            min = Math.min(min, a);
            max1 = Math.max(max1, b);
            min1 = Math.min(min1, b);
        }
        System.out.print((max - min) * (max1 - min1));
    }
}