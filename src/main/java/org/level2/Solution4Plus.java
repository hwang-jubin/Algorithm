package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/70129
//이진 변환 반복하기
public class Solution4Plus {
    public int[] solution(String str) {

        int[] answer = new int[2];

        while(str.length()>1){
        int num = 0;
        for(char x : str.toCharArray()){
            //0 이 아닌 것의 개수 세기
            if(x!='0'){
                num++;
            //0을 몇개 제거했는지 개수 세기
            }else{
                answer[1]++;
            }
        }
        //0이 아닌 것의 개수를 2진법으로 string으로 변환하기
        //정수 num을 2진법으로 바꾸어서 string으로 반환
        str = Integer.toString(num, 2);
        }
        return answer;
    }

}
