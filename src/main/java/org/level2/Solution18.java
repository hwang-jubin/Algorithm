package org.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

//https://school.programmers.co.kr/learn/courses/30/lessons/42586
//기능개발
public class Solution18 {
    public ArrayList<Integer> solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();

        Queue<Integer> que = new LinkedList();

        int first = 0;
        for(int i = 0 ; i < progresses.length; i++){

            int day = day(progresses[i], speeds[i]);
            //que가 비어있으면 첫번째순서로 삼음
            if(que.isEmpty()) {
                first = day;
            }else if(first < day){
                answer.add(que.size());
                que.clear();
                first = day;
            }
            que.add(day);
        }

        if(!que.isEmpty()) answer.add(que.size());

        return answer;
    }

    public int day(int progress, int speed){

        int day = (int)Math.ceil((double)(100 - progress) / speed);

        return day;
    }
}
