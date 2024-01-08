// if문을 이용한 풀이
class Solution {
    public String solution(int num) {
        String answer = "";
        if (num % 2 == 0) {
            answer = "Even";
        }else {
            answer = "Odd";
        }
        return answer;
    }
}

// 삼항연산자를 이용한 풀이
// class Solution {
//     public String solution(int num) {
//         String answer = "";
//         return (num % 2 == 0) ? "Even" : "Odd";
//     }
// }
