package data_structure.boj_11659;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        StringTokenizer numbersInput = new StringTokenizer(br.readLine());
        int[] numbersArray = new int[N + 1];

        for (int i = 0; i < N; i++) {
            if (i == 0) {
                numbersArray[i + 1] = Integer.parseInt(numbersInput.nextToken());
            } else {
                numbersArray[i + 1] = Integer.parseInt(numbersInput.nextToken()) + numbersArray[i];
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer sumRange = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(sumRange.nextToken());
            int end = Integer.parseInt(sumRange.nextToken());
            System.out.println(numbersArray[end] - numbersArray[start-1]);
        }
    }
}
