package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12916
//문자열 내 p와 y의 개수
public class Solution5Plus {
    boolean solution(String s) {
        s = s.toUpperCase();

        //p와 y를 각각 제거한 길이를 원본 길이에서 빼면 p의 개수를 알 수 있음
        //시간복잡도는 O(n)으로 string을 직접 순회하는 것과 같음
        int x = s.length() - s.replace("P", "").length();
        int y = s.length() - s.replace("Y", "").length();

        return x==y;
    }

}
