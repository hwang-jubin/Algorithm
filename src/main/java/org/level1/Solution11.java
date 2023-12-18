package org.level1;

import java.util.ArrayList;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/68644
//두 개 뽑아서 더하기

public class Solution11 {
    public ArrayList<Integer> solution(int[] num) {
        ArrayList<Integer> arr = new ArrayList<Integer>();

        for(int i = 0 ; i < num.length - 1 ; i++){
            for(int j = i+1 ; j<num.length ; j++){
                if(!arr.contains(num[i]+num[j])){
                    arr.add(num[i]+num[j]);
                }

            }

        }

        Collections.sort(arr);
        return arr;
    }
}
