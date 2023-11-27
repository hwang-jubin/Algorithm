package org.level1;

//자연수 뒤집어 배열로 만들기
//https://school.programmers.co.kr/learn/courses/30/lessons/12932
public class Solution1 {
    public int[] solution(long n) {

        String str = Long.toString(n);

        String result = new StringBuilder(str).reverse().toString();

        int[] answer = new int[result.length()];

        for(int i = 0 ; i< answer.length ; i++){

            answer[i] = result.charAt(i) -'0';

        }
        return answer;
    }


}
