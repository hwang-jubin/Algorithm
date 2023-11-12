package org.level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/42885
//구명보트



public class Solution8 {
    class Solution {
        public int solution(int[] people, int limit) {
            int answer = 0;
            int n = people.length;
            Arrays.sort(people);

            int i = n - 1;
            int j = 0;

            while (i > j) {
                if (people[i] + people[j] <= limit) {
                    i--;
                    j++;
                } else {
                    i--;
                }
            }

            return answer = (n - j);
        }
    }
}
