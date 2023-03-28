package baekjoon.p1934;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        Stream<int[]> triples = IntStream.rangeClosed(1, 100).boxed()
                .flatMap(a -> IntStream
                        .rangeClosed(a, 100)
                        .filter(b -> Math.sqrt(a * a + b * b) % 1 == 0)
                        .mapToObj(b ->
                                new int[]{a, b, (int)Math.sqrt(a * a + b * b)})
                );

        triples.limit(3)
                .forEach(i -> System.out.println(i[0] + " " + i[1] + " " + i[2]));

    }
}
