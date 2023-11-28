package org.level1;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/68935
//3진법 뒤집기
public class Solution4 {
    public long solution(long n) {
        Stack<Long> arr = new Stack<Long>();

        while(n>0){
            arr.push(n%3);
            n=n/3;
        }

        long answer = 0;
        long size= arr.size();
        long a = 1L;
        for(long i = 0 ; i<size ; i ++ ){
            answer += arr.pop()*a;
            a=a*3;
        }
        return answer;
    }
}
