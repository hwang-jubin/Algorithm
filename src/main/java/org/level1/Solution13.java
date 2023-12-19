package org.level1;

import java.util.ArrayList;
import java.util.Collections;

//https://school.programmers.co.kr/learn/courses/30/lessons/12915
//문자열 마음대로 정리하기
public class Solution13 {
    public String[] solution(String[] strings, int n) {

        ArrayList<String> arr = new ArrayList<>();
        for(int i = 0 ; i < strings.length ; i++){
            arr.add(strings[i].charAt(n) + strings[i]);
        }

        Collections.sort(arr);
        String[] answer = new String[arr.size()];

        for(int i = 0 ; i< strings.length ; i++){
            answer[i] = arr.get(i).substring(1, arr.get(i).length());
        }

        return answer;
    }
}
