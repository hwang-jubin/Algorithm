package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12915
//문자열 마음대로 정리하기

import java.util.Arrays;

public class Solution13Plus {
    public String[] solution(String[] strings, int n) {

        Arrays.sort(strings, (s1, s2) -> {
            if(s1.charAt(n) != s2.charAt(n)){
                return s1.charAt(n) - s2.charAt(n);}
        return s1.compareTo(s2);});

        return strings;
    }
}
