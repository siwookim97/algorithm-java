package baekjoon.p2480;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();
        int count = 1;
        int number = 0;

        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());

            if (list.contains(num)) {
                count++;
                number = num;
            }

            list.add(num);
        }

        if (count == 3) {
            System.out.println(10000 + (number * 1000));
        } else if (count == 2) {
            System.out.println(1000 + (number * 100));
        } else {
            list.sort((o1, o2) -> o2 - o1);
            System.out.println(list.get(0) * 100);
        }
    }
}
