package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12926
//시저암호
public class Solution2 {
    public String solution(String s, int n) {
        String answer = "";

        int a = 0 ;
        for(int i = 0 ; i< s.length(); i++){
            if(s.charAt(i)==' '){
                answer+=s.charAt(i);
                continue;
            }

            a = s.charAt(i)+n;

            if(s.charAt(i)<91 && a>90){
                a-=26;
            }

            if (a > 122){
                a-=26;
            }

            answer+=(char)a;
        }
        return answer;
    }
}
