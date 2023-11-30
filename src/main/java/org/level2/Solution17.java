package org.level2;

import java.util.Stack;

//https://school.programmers.co.kr/learn/courses/30/lessons/42584
//주식 가격
public class Solution17 {
    public int[] solution(int[] prices) {

        int[] answer = new int[prices.length];

        Stack<Integer> stk = new Stack<>();

        //index를 stack 에 넣고, 작은 수가 나왔을 때 stack 에 쌓여있는 값과 비교
        //stack 에 있는 index에서 비교 index를 빼면 초 간격이 나옴
        for(int i = 0 ; i< prices.length ; i++){

            while(!stk.isEmpty() && stk.peek() > prices[i]){
                int index = stk.pop();
                answer[index] = i-index;
            }
            stk.push(i);
        }

        while(!stk.isEmpty()){
            int index = stk.pop();
            answer[index] = prices.length-index -1;
        }
        return answer;
    }
}
