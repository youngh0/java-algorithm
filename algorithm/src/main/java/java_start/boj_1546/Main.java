package java_start.boj_1546;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());

        double[] scores = new double[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(scores);
        double maxScore = scores[N-1];

        for (int i = 0; i < N; i++) {
            if (scores[i] == maxScore) {
                scores[i] = 100;
                continue;
            }
            scores[i] = scores[i] / maxScore * 100;
        }


        double sum = Arrays.stream(scores)
                .sum();
        System.out.println(String.format("%.6f", sum/N));
    }
}
