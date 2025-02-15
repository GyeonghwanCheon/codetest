class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;

        while (n >= a) {
            int newBottles = (n / a) * b;  // 받은 병 개수
            answer += newBottles; // 받은 병 더하기
            n = (n % a) + newBottles; // 남은 병 + 받은 병
        }

        return answer;
    }
}