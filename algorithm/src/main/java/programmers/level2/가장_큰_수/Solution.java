package programmers.level2.가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Solution {
    public String solution(int[] numbers) {
        String answer = Arrays.stream(numbers)
                .mapToObj(num -> String.valueOf(num))
                .sorted((s1, s2) -> (s2+s1).compareTo(s1+s2))
                .collect(Collectors.joining());
        if (answer.startsWith("0")) {
            return "0";
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.solution(new int[]{6, 10, 2});
    }
}
