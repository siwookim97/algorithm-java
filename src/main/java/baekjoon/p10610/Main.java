package baekjoon.p10610;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

// Silver 4
// 최대 10^5개의 수를 받아 30이되는 가장 큰 수를 만들기
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] arr = str.split("");
        int sum = Arrays.stream(arr)
                .mapToInt(Integer::parseInt)
                .sum();

        // 0이 없으면 나눌 수 없고 3으로 나누어져야함
        if (!str.contains("0") || sum % 3 != 0) {
            System.out.println(-1);
            return;
        }

        Arrays.stream(arr).sorted(Comparator.reverseOrder()).forEach(System.out::print);

    }
}
