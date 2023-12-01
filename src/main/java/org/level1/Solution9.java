package org.level1;

import java.util.ArrayList;
//https://school.programmers.co.kr/learn/courses/30/lessons/42840
//모의고사
public class Solution9 {
    public ArrayList<Integer> solution(int[] answers) {
        int[] answer = new int[3];

        ArrayList<Integer> arr = new ArrayList<Integer>();
        int [] a = {1,2,3,4,5};
        int [] b = {2,1,2,3,2,4,2,5};
        int [] c = {3,3,1,1,2,2,4,4,5,5};
        
        for(int i = 0 ; i<answers.length ; i ++){

            if(answers[i]==a[i%5]){
                answer[0]++;
            }
            if(answers[i]==b[i%8]){
                answer[1]++;
            }
            if(answers[i]==c[i%10]){
                answer[2]++;
            }
        }

        int largest = Math.max(Math.max(answer[0], answer[1]), answer[2]);

        // 가장 큰 수를 찾고 그 수와 같은 것들을 ArrayList에 넣기
        // System.out.println(largest);

        for(int i = 0 ; i < 3 ; i ++){
            if(answer[i]==largest){
                arr.add(i+1);
            }
        }
        return arr;
    }
}
