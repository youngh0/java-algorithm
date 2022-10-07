package backTracking.boj_15656;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    static boolean[][] visited;
    static int[] arr;
    static int n;
    static int m;

    static List<Integer> tmp = new ArrayList<>();
    static StringBuilder sb = new StringBuilder();
    static StringTokenizer st;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        arr = new int[n];
        visited = new boolean[m][n];

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        solution(0);
        System.out.println(sb);
    }

    static void solution(int depth) {
        if (depth == m) {
            for (Integer integer : tmp) {
                sb.append(integer);
                sb.append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 0; i < n; i++) {
            if(!visited[depth][i]){
                tmp.add(arr[i]);
                visited[depth][i] = true;

                solution(depth+1);

                tmp.remove(tmp.size() - 1);
                visited[depth][i] = false;
            }
        }
    }
}
