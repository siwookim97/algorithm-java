package baekjoon.p2525;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int hh = Integer.parseInt(st.nextToken());
        int mm = Integer.parseInt(st.nextToken());
        int time = Integer.parseInt(br.readLine());

        int mmSum = (hh * 60) + mm + time;

        if (mmSum / 60 > 23) {
            sb.append((mmSum / 60) - 24 + " ");
            sb.append(mmSum % 60);
        } else {
            sb.append(mmSum / 60 + " ");
            sb.append(mmSum % 60);
        }

        System.out.println(sb);
    }
}
