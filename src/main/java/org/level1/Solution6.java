package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/81301
//숫자 문자열과 영단어
public class Solution6 {

    public static int solution(String s) {
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));
            }
        }
        return Integer.parseInt(s);
    }

}
