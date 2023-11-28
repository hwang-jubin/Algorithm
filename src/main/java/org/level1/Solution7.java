package org.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12918
//문자열 다루기 기본
public class Solution7 {
    public boolean solution(String s) {
        boolean answer = false;

        if(s.length()==4 ||s.length()==6){
            for(int i = 0 ; i< s.length() ; i++){
                if((int)s.charAt(i)>57){
                    return answer;
                }
            }
        }else{
            return answer;
        }
        return answer=true;
    }
}
