class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = x; // long 타입으로 변환된 x 값을 저장

        for (int i = 0; i < n; i++) {
            answer[i] = value;
            value += x; // x를 더해가며 값을 갱신, long 타입 범위 내에서 처리
        }

        return answer;
    }
}