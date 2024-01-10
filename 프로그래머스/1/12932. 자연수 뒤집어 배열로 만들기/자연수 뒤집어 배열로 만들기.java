class Solution {
    public int[] solution(long n) {
        String str = Long.toString(n); // 정수를 문자열로 변환
        int len = str.length();
        int[] answer = new int[len];
        
        for (int i = 0; i < len; i++) {
            answer[i] = (int) (n % 10); // 현재 자릿수 값을 배열에 저장
            n /= 10; // 다음 자릿수로 이동
        }
        
        return answer;
    }
}
