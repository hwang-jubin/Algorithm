package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12951

public class Solution1 {
    public String solution(String s) {
        String answer = "";

        boolean bool = true;
        for (int i = 0; i < s.length(); i++) {

            if(s.charAt(i)==' '){
                bool= true;
                answer += s.charAt(i);
            }else{
                if(bool){
                    answer += Character.toUpperCase(s.charAt(i));
                    bool = false;
                }else{
                    answer += Character.toLowerCase(s.charAt(i));
                }
            }
        }
        return answer;
    }

}