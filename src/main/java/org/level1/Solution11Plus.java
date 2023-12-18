package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/68644
//두 개 뽑아서 더하기

import java.util.*;

public class Solution11Plus {
    public int[] solution(int[] num) {
//        [2,1,3,4,1]

        HashSet<Integer> answer = new HashSet<>();
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                answer.add(num[i] + num[j]);
            }
        }
        return answer.stream().mapToInt(s->Integer.parseInt(String.valueOf(s))).sorted().toArray();
    }
}
