package programmers.level3.기지국;

class Solution {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;
        int nearStation = 0;
        int position = 1;

        while (position <= n) {
            if (nearStation < stations.length && position >= stations[nearStation] - w) {
                position = stations[nearStation] + w + 1;
                nearStation += 1;

            } else {
                answer += 1;
                position += w * 2 + 1;

            }
        }

        return answer;
    }
}
