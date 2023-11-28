package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/68935
//3진법 뒤집기
public class Solution4Plus {

    public long solution(long n) {
        //10진수로 표현된 n 을 3진수로 바꾸어서 string으로 반환하기
        String str = Long.toString(n , 3);
        //뒤집기
        StringBuilder builder = new StringBuilder(str).reverse();
        //3진수로 되어있는 string을 10진수 정수로 바꾸기
        long answer = Long.parseLong(builder.toString(), 3);

        return answer;
    }
}
