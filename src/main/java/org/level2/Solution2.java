package org.level2;

import java.util.Arrays;

//https://school.programmers.co.kr/learn/courses/30/lessons/12941
public class Solution2 {

    public int solution(int A[], int B[])
    {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        for(int i = 0 ; i < A.length ; i ++){
            answer += A[i]*B[B.length-i-1];
        }

        return answer;
    }

}
