package baekjoon.p2501;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

// Bronze 3
// 약수의 순서를 구하는 알고리즘
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) {
                set.add(i);
                set.add(n / i);
            }
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list, (o1, o2) -> o1 - o2);

        if (k > list.size()) {
            System.out.println(0);
        } else {
            System.out.println(list.get(k - 1));
        }
    }
}