package baekjoon.p2587;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Bronze 2
// List 의 정렬
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> list = new ArrayList<>();

        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));
        list.add(Integer.parseInt(br.readLine()));

        Collections.sort(list, (o1, o2) -> o1 - o2);
        System.out.println(list.stream().mapToInt(Integer::intValue).sum() / 5);
        System.out.println(list.get(list.size() / 2));
    }
}
