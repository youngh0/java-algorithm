package greedy.boj_2217;

// 내림차순 정렬

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

    static int[] ropes;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int ans = 0;
        ropes = new int[n];

        for (int i = 0; i < n; i++) {
            ropes[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(ropes);

        for (int i = 0; i < n; i++) {
//            System.out.println("ropes[i] * n - i = " + ropes[i] * n - i);
            ans = Math.max(ans, ropes[i] * (n - i));
        }

        System.out.println(ans);

    }
}
