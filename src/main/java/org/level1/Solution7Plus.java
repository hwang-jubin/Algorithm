package org.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12918
//문자열 다루기 기본
public class Solution7Plus {

    public boolean solution(String s) {
        return s.matches("[0-9]{4}||[0-9]{6}");
    }
}
