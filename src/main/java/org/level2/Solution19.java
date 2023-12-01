package org.level2;
//https://school.programmers.co.kr/learn/courses/30/lessons/42583
//다리를 지나는 트럭

import java.util.LinkedList;
import java.util.Queue;

public class Solution19 {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        Queue<Integer> que = new LinkedList<>();


        for(int i = 0 ; i < bridge_length ; i ++){
            que.add(0);
        }

        int index = 0;
        int bridge_weight = 0;
        while(index<truck_weights.length){
            bridge_weight-=que.poll();

            int truck_weight = truck_weights[index];
            if(bridge_weight+truck_weight<bridge_length){
                que.add(truck_weight);
                bridge_weight+=truck_weight;
                index++;
            }else{
                que.add(0);
            }
            answer++;
        }

        while(bridge_weight>0){
            bridge_weight-=que.poll();
            answer++;
        }

        return answer;
    }
}
