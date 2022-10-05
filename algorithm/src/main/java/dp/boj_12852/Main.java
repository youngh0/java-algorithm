package dp.boj_12852;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[][] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 1][2];


        for (int i = 2; i < n + 1; i++) {
            dp[i][0] = dp[i - 1][0] + 1;
            dp[i][1] = i - 1;

            if (i % 2 == 0 && dp[i/2][0] + 1 < dp[i][0] ) {
                dp[i][0] = dp[i/2][0] + 1;
                dp[i][1] = i/2;
            }
            if (i % 3 == 0 && dp[i/3][0] + 1 < dp[i][0] ) {
                dp[i][0] = dp[i/3][0] + 1;
                dp[i][1] = i/3;
            }
        }

        sb.append(dp[n][0]).append("\n");

        int target = n;

        while (target != 1) {
            sb.append(target).append(" ");
            target = dp[target][1];
        }
        sb.append(1);
        System.out.println(sb);


    }
}
