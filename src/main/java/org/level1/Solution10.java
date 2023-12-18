package org.level1;

import java.util.ArrayList;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/42748
//K번째 수

public class Solution10 {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i = 0 ; i < commands.length ; i++){

            for(int j = commands[i][0]-1 ; j < commands[i][1] ; j++){
                arr.add(array[j]);
            }

            Collections.sort(arr);

            answer[i]= arr.get(commands[i][2]-1);

            arr.clear();

        }
        return answer;
    }
}
