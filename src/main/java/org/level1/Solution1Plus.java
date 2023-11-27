package org.level1;

import java.util.ArrayList;

//자연수 뒤집어 배열로 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/12932

public class Solution1Plus {
    public ArrayList<Integer> solution(long n) {

        ArrayList<Integer> answer = new ArrayList<>();

        while(n>0){
            answer.add((int) (n%10));
            n = n/10;
        }
    return answer;
    }

}
