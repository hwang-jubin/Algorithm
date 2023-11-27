package org.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12930
//이상한 문자 만들기
public class Solution3 {
    public String solution(String s) {
        StringBuilder str = new StringBuilder();

        boolean upper = true;
        for(char x: s.toCharArray()){
            if(!Character.isAlphabetic(x)){
                str.append(x);
                upper=true;
            }else {
                if (upper) {
                    str.append(Character.toUpperCase(x));
                } else {
                    str.append(Character.toLowerCase(x));
                }
                upper=!upper;
            }
        }
        return str.toString();
    }

}
