package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/42840
//모의고사
import java.util.stream.IntStream;
public class Solution9Plus {

    private static final int[][] rules ={{1, 2, 3, 4, 5},{2, 1, 2, 3, 2, 4, 2, 5},{ 3, 3, 1, 1, 2, 2, 4, 4, 5, 5}};

    public int getPicked(int problem , int person){
        int[] rule = rules[person];
        int index = problem % rule.length;
        return rule[index];
    }

    public int[] solution(int[] answers) {
        int[] corrects = new int[3];
        int max = 0;

        for(int i = 0 ; i < answers.length ; i++){
            for(int j = 0 ; j < rules.length ; j++){
                int picked = getPicked(i, j);
                if(picked==answers[i]){
                    corrects[j]++;
                    if(corrects[j]>max){
                        max = corrects[j];
                    }
                }
            }
        }

        final int finalMax = max;
        int[] answer = IntStream.
                range(0, 3).
                filter(i -> corrects[i] == finalMax)
                .map(i -> i + 1)
                .toArray();

        return answer;
    }

}
