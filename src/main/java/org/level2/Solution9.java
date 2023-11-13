package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12985
//예상 대진표

public class Solution9 {

    public int solution(int n, int a, int b)
    {
        int round = 0;

        while (a != b) {
            a = (a + 1) / 2;
            b = (b + 1) / 2;
            round++;
        }

        return round;
    }

}