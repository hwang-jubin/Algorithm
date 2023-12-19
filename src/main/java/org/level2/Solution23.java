package org.level2;

import java.util.Arrays;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/42746
//가장 큰 수
public class Solution23 {
    public String solution(int[] numbers) {

        //int를 String으로 바꾸어서,숫자 더하는 것이 아닌 문자열 더하듯이 하기 -> 이후 다시 Integer로 바꾸기
        String collect = Arrays.stream(numbers).mapToObj((str) -> String.valueOf(str))
                .sorted((s1, s2) -> {
                    int original = Integer.parseInt(s1 + s2);
                    int reverse = Integer.parseInt(s2 + s2);
                    //내림차순 하기
                    return reverse - original;
                    //공백없이 String 으로 만들기
                }).collect(Collectors.joining(""))
                //0이 연속해서 나오는 test case를 위해서 맨 앞에 0이 여러번 반복되어 나오는 경우 0 한개로 처리
                .replaceAll("^0+","0");

        return collect;
    }

}
