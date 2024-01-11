class Solution {
    public long solution(long n) {
        long answer = -1; // 기본적으로 -1로 초기화

        for (long i = 1; i * i <= n; i++) {
            if (i * i == n) {
                answer = (i + 1) * (i + 1);
                break; // 원하는 조건을 만족하면 반복문을 종료
            }
        }
        return answer;
    }
}