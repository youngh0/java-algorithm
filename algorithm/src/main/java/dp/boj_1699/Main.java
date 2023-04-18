package dp.boj_1699;
// [0, 1, 2, 3, 1, 2, 3, 4, 2, 1, 2, 3, 3, 2, 3, 4, 1, 2, 2, 3, 2, 3, 3, 4, 3, 1, 2, 3, 4, 2, 3, 4, 2, 3, 2, 3, 1, 2, 3, 4, 2, 2, 3, 3]
// [0, 1, 2, 3, 1, 2, 3, 4, 2, 1, 2, 3, 4, 2, 3, 4, 1, 2, 3, 4, 2, 3, 4, 5, 3, 1, 2, 3, 4, 2, 3, 4, 5, 3, 2, 3, 1, 2, 3, 4, 2, 3, 4, 5]
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] dp;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        dp = new int[n + 1];
        dp[1] = 1;

//        for (int i = 1; i < n + 1; i++) {
//            dp[i] = i;
//        }
//
//        for (int i = 1; i < n + 1; i++) {
//            for (int j = 1; j * j <= i; j++) {
//                dp[i] = Math.min(dp[i], dp[i - (j * j)] + 1);
//            }
//        }
        for (int i = 2; i < n + 1; i++) {
            double sqrt = Math.sqrt(i);
            double pow = Math.pow((int)sqrt, 2);
            int squared = (int) pow;

            dp[i] = dp[i - squared]+1;
        }
        System.out.println(dp[n]);
        System.out.println(Arrays.toString(dp));
    }
}
