class Solution {
    public boolean solution(int x) {
        boolean answer = false; // 초기값을 false로 설정
        int num = 0;
        int originalX = x; // x의 원래 값 저장

        while (x > 0) {
            num = num + (x % 10);
            x = x / 10;
        }

        int answerNum = num + x; // x는 이미 0이 되었으므로 num 값 자체가 answerNum이 됨

        if (originalX % answerNum == 0) {
            answer = true; // 나누어 떨어지면 true
        }

        return answer;
    }
}
