package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12917
//문자열 내림차순으로 배치하기

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Solution12Plus {
    public String solution(String s) {
//        "Zbcdefg"
        StringBuilder collect = s.chars().boxed().sorted((v1, v2) -> v2 - v1)
                .collect(StringBuilder::new, (sb, codePoint) -> sb.append(Character.toChars(codePoint)), StringBuilder::append);

        return collect.toString();
    }
}
