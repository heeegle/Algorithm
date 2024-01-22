#분모가 같을경우 = denum1+denum2/ num1(num2)   # 분자 / 분모
#분모가 다를경우 = (denum1 * num2) + (denum2 * num1) / num1*num2 #분자 / 분모

def solution(denum1, num1, denum2, num2):
    answer = [] 
    if num1 == num2:
        answer = [denum1+denum2, num1]
        return answer

    elif num1 < num2 and num2%num1 == 0:
        num1, num2 = num2, num1
        a = num2 / num1
        answer = [(denum1 * a) + denum2, num2]
        return answer

    else:
        answer = [(denum1 * num2) + (denum2 * num1), num1*num2]


# 분모가 다른 분수의 계산을 편하게 해주는 함수     
from fractions import Fraction

def solution(denum1, num1, denum2, num2):
    f = Fraction(denum1, num1) + Fraction(denum2, num2)
    answer = [f.numerator, f.denominator]
    return answer



