package org.level2;


//https://school.programmers.co.kr/learn/courses/30/lessons/12953
//n개의 최소공배수

//유클리드 호제법
//최대공약수 먼저 구하기 - 큰수를 작은수로 나누고 나머지가 있으면 작은수에서 나머지를 나누기. 반복 후 나머지가 0이 나오게 하는 수가 최대공약수
//최소공배수는 두수를 곱하고 최대공약수를 나눈 값

import java.util.Arrays;
public class Solution10 {
    class Solution {
        public void main(String[] args) {
            int[] arr = {2, 6, 8, 14};
            System.out.println(solution(arr)); // 출력: 168
        }

        public int solution(int[] arr) {
            return lcmOfArray(arr);
        }

        // 최대공약수를 계산하는 함수
        private int gcd(int a, int b) {
            while (b != 0) {
                int temp = b;
                b = a % b;
                a = temp;
            }
            return a;
        }

        // 최소공배수를 계산하는 함수
        private int lcm(int a, int b) {
            return a * b / gcd(a, b);
        }

        // 배열의 수들의 최소공배수를 계산하는 함수
        private int lcmOfArray(int[] arr) {
            int result = arr[0];
            for (int i = 1; i < arr.length; i++) {
                result = lcm(result, arr[i]);
            }
            return result;
        }
    }

}
