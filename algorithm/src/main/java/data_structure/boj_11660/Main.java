package data_structure.boj_11660;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];

        for (int i = 0; i < N; i++) {
            StringTokenizer row = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                if (j == 0) {
                    arr[i][j] = Integer.parseInt(row.nextToken());
                } else {
                    arr[i][j] = Integer.parseInt(row.nextToken()) + arr[i][j - 1];
                }
            }
        }

        for (int i = 0; i < M; i++) {
            StringTokenizer sumRange = new StringTokenizer(br.readLine());
            int startX = Integer.parseInt(sumRange.nextToken());
            int startY = Integer.parseInt(sumRange.nextToken());
            int endX = Integer.parseInt(sumRange.nextToken());
            int endY = Integer.parseInt(sumRange.nextToken());
            int sum = 0;
            for (int j = startX-1; j <= endX - 1; j++) {
                if (startY == 1) {
                    sum += arr[j][endY - 1];
                } else {
                    sum += arr[j][endY - 1] - arr[j][startY - 2];
                }
            }
            sb.append(sum + "\n");
        }
        System.out.print(sb);

    }
}
