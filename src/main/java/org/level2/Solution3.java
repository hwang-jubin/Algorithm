package org.level2;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/12909

public class Solution3 {
    public Boolean solution(int A[], int B[])
    {
        boolean answer = true;

        String str = "()()";
        Stack stk = new Stack();

        for(int i = 0 ; i < str.length() ; i++){

            if(str.charAt(i)=='('){
                stk.push(str.charAt(i));
            }else{
                if(stk.empty()){
                    answer=false;
                }else{
                    stk.pop();
                }

            }
        }

        if(!stk.empty()){
            answer = false;
        }

        return answer;
    }
}
