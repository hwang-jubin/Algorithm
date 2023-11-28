package org.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12916
//문자열 내 p와 y의 개수
public class Solution5 {
    boolean solution(String s) {
        boolean answer = true;

        s=s.toUpperCase();
        char[] arr = s.toCharArray();


        int p=0;
        int y=0;
        for(int i=0 ; i< s.length() ; i++){
            if(arr[i]=='P'){
                p++;
            }else if(arr[i]=='Y'){
                y++;
            }
        }

        if(p!=y) {
            answer= false;}
        return answer;
    }
}
