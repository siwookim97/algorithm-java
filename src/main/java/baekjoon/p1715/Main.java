package baekjoon.p1715;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Long> que = new PriorityQueue<>();
        Long result = 0l;

        for (int i = 0; i < N; i++) {
            que.add(Long.parseLong(br.readLine()));
        }

        while (que.size() > 1) {
            Long sum = que.poll() + que.poll();
            que.offer(sum);
            result += sum;
        }

        System.out.println(result);
    }
}
