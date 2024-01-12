import java.util.*;

class Solution {
    public long solution(long n) {
         // 정수를 문자열로 변환
        String numStr = Long.toString(n);

        // 문자열을 문자 배열로 변환
        char[] charArray = numStr.toCharArray();

        // 문자 배열을 큰 숫자 순서로 정렬
        Arrays.sort(charArray);

        // 문자 배열을 StringBuilder를 사용하여 역순으로 변환
        StringBuilder reversedStr = new StringBuilder(new String(charArray)).reverse();

        // StringBuilder를 다시 문자열로 변환하여 정수로 반환
        long answer = Long.parseLong(reversedStr.toString());

        return answer;
    }
}