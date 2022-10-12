package dp.boj_14501;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int[] dp;
    static int[] costs;
    static int[] pay;
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        dp = new int[n + 2];
        costs = new int[n + 1];
        pay = new int[n + 1];


        for (int i = 1; i < n+1; i++) {
            st = new StringTokenizer(br.readLine());
            int cost = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            costs[i] = cost;
            pay[i] = p;
        }


        for (int i = n; i >= 0; i--) {
            if (costs[i] + i > n+1) {
                //상담 진행 불가
                dp[i] = dp[i + 1];
            }
            else{
                dp[i] = Math.max(pay[i] + dp[i + costs[i]], dp[i + 1]);
            }
        }
        System.out.println(dp[0]);
    }
}
