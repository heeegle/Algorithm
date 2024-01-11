class Solution {
    public long solution(long n) {
        long answer = 0;
        for (long i = 1; i <= n; i++) {
            if (i * i == n) {
                i = i + 1;
                answer = i * i;
                break;
            } else {
                answer = -1;
            }
        }
        return answer;
    }
}