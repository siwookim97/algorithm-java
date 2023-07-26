package softeer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 바이러스가 1초당 p배씩 증가
public class Virus {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long k = Integer.parseInt(st.nextToken());
        long p = Integer.parseInt(st.nextToken());
        long n = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            k *= p;
            k %= 1000000007;
        }

        System.out.println(k);
    }
}
