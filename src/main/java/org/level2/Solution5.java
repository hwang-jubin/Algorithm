package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/42842#

public class Solution5 {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];

        for(int i = 1 ; i <= Math.sqrt(yellow) ; i++){
            if(yellow % i == 0){
                int a  = (yellow/i);
                int b  = i;

                int ba = (a + 2) * 2 + b * 2;
                if(ba ==brown){
                    answer[0] = a + 2;
                    answer[1] = b + 2;
                    break;
                }
            }
        }
        return answer;
    }
}
