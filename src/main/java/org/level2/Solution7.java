package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/12980
//점프와 순간이동

public class Solution7 {
    public int solution() {
        int n = 6;
        int ans = 0;

        while(n>=1){
            if(n%2!=0){
                ans+=1;
            }
            n=n/2;
        }
        return ans;
    }
}
