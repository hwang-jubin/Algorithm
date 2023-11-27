package org.level1;
//https://school.programmers.co.kr/learn/courses/30/lessons/12930
//이상한 문자 만들기
public class Solution3 {
    public String solution(String s) {
        String answer = "";
        char[] arr = new char[s.length()];


        boolean even = true ;
        for(int i = 0 ; i<s.length() ; i++){

            if(s.charAt(i)==' '){
                arr[i]=' ';
                even=true;
                continue;
            }

            if(even){
                arr[i]=Character.toUpperCase(s.charAt(i));
            }else if(!even){
                arr[i]=Character.toLowerCase(s.charAt(i));
            }

            even=!even;
        }

        System.out.println(arr);
        return String.valueOf(arr);
    }

}
