package programmers.level1.예산;

import java.util.Arrays;

public class Main {
    public int solution(int[] budgets, int M) {
        int left = 0;

        int right = Arrays.stream(budgets)
                .max().getAsInt();

        int answer = 0;
        while (left < right) {
            int mid = (left + right) / 2;
            int sum = 0;

            for (int budget : budgets) {
                if (budget > mid) {
                    sum += mid;
                } else {
                    sum += budget;
                }
            }

            if (sum <= M) {
                left = mid + 1;
                answer = sum;
            }
            else right = mid - 1;
        }

        return answer;
    }
}
