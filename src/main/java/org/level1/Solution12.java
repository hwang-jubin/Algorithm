package org.level1;

//https://school.programmers.co.kr/learn/courses/30/lessons/12917
//문자열 내림차순으로 배치하기

public class Solution12 {
    public String solution(String s) {
        String answer = "";
        char[] arr = s.toCharArray();
        int[] intArray = new int[arr.length];

        for(int i = 0 ; i < s.length() ; i++){
            intArray[i] = (int)arr[i];
        }
        //숫자정렬
        for(int i = 0 ; i < s.length(); i++){
            for(int j = 0 ; j<s.length()-1-i; j++ ){
                if(intArray[i]>intArray[i+1]){
                    int ren = intArray[i];
                    intArray[i]=intArray[i+1];
                    ren=intArray[i];
                }
            }

        }

        for(int i = 0 ; i < s.length() ; i++){
            arr[i] = (char)intArray[i];
            System.out.println(arr[i]);
        }

        answer= String.valueOf(arr);

        return answer;
    }
}
