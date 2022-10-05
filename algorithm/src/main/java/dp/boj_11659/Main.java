package dp.boj_11659;

/*
5 3
5 4 3 2 1
1 3
2 4
5 5
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int tc = Integer.parseInt(st.nextToken());

        arr = new int[n + 1];
        dp = new int[n + 1];

        st = new StringTokenizer(br.readLine());

        for (int i = 1; i < n + 1; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        // dp테이블 완성
        for (int i = 1; i < n + 1; i++) {
            dp[i] = dp[i - 1] + arr[i];
        }

        for (int i = 0; i < tc; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append(dp[b] - dp[a - 1]);
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
