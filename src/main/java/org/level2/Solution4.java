package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129

public class Solution4 {
    public int[] solution(String s) {
        String str = "110010101001";
        int[] answer = new int[2]; // 라운드 횟수, 0을 삭제한 총 개수

        while (str.length() > 1) {
            answer[0]++;

            int countOfOne = 0; // 1의 개수 카운팅
            for(int i = 0 ; i <str.length() ; i ++){
                if(str.charAt(i)=='0'){
                    answer[1]++; // 0인 경우
                }else{
                    countOfOne++; // 1인 경우
                }
            }
            str = "";
            //이진변환
            while( countOfOne >= 1 ){
                str = Integer.toString(countOfOne % 2) + str;
                countOfOne = countOfOne / 2;
            }

        }
        return answer;
    }
}

