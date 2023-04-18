package java_start.boj_11720;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(String.valueOf(s.charAt(i)));
        }
        System.out.println(sum);
    }
}
