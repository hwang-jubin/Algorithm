package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12926
//시저암호
public class Solution2 {
    public String solution(String s, int n) {

        StringBuilder str = new StringBuilder();

        for (char x : s.toCharArray()) {

            //x가 알파벳이 아닐 때는 공백 그대로 str에 추가
            if (!Character.isAlphabetic(x)) {
                str.append(x);
                System.out.println(x);
            } else {
                //알파벳을 0부터 시작하게 만들기
                char offset = Character.isUpperCase(x) ? 'A' : 'a';
                //몇번째인지 확인
                int position = x - offset;
                //알파벳 길이보다 더 초과하게 되면 처음으로 돌아가기 위해서 알파벳 개수만큼 나눈 나머지를 취하기
                position = (position+n)%26;
                //원래 알파벳 아스키 코드로 복귀후 char 로 만들기
                str.append((char)(position+offset));
            }
        }
        return str.toString();
    }
}
