package org.level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12981
//영어 끝말잇기

public class Solution6 {

    class Solution {
        public int[] solution(int n, String[] words) {

            int[] answer = {0, 0};

            String[] tmpWords = new String[words.length];
            tmpWords[0] = words[0];

            char last = words[0].charAt(words[0].length() - 1);
            int indexOf = 0;
            for (int i = 1; i < words.length; i++) {
                int index = Arrays.asList(tmpWords).indexOf(words[i]);
                //같은 단어를 말하거나
                //끝말잇기를 잘못했을 때

                if (index != -1 || words[i].charAt(0) != last) {
                    indexOf = i;
                    //누가 걸렸는지
                    answer[0] = indexOf % n + 1;

                    //몇번째 turn
                    answer[1] = (indexOf / n) + 1;
                    return answer;
                }
                last = words[i].charAt(words[i].length() - 1);
                tmpWords[i] = words[i];
            }
            return answer;
        }
    }
}