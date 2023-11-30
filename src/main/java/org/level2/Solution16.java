package org.level2;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/76502
//괄호 회전하기

public class Solution16 {
    public int solution(String s) {
        int answer = 0;

        for(int i = 0 ; i<s.length() ; i++){
            //짝이 맞는지 확인하는 함수
            if(isCorrect(i, s)){
                answer++;
            }

        }
        return answer;
    }

    public boolean isCorrect(int offset, String s){

        Stack<Character> stk = new Stack<>();


        for(int i = 0 ; i<s.length() ; i++){
            //밀리는 횟수를 더해서, length로 나누면 rotation되어 나온 index값을 얻을 수 있음
            char c = s.charAt((i+offset)%s.length());

            switch (c){
                case '{' -> stk.push('}');
                case '[' -> stk.push(']');
                case '(' -> stk.push(')');
                case '}',']',')' -> {
                    if(stk.isEmpty()){
                        return false;
                    }
                    if(stk.pop()!=c) return false;
                }
            }
        }
        return stk.isEmpty();
    }

}
