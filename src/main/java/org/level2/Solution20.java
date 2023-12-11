package org.level2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

//https://school.programmers.co.kr/learn/courses/30/lessons/42839
//소수찾기
public class Solution20 {

    public int solution(String num) {
        int answer = 0;
//        "17"
        Set<Integer> primes = new HashSet<>();
        List<Integer> numbers = num.chars().map(c -> c - '0').boxed().collect(Collectors.toList());

        getPrimes(0, numbers, primes);

        return primes.size();
    }


    //소수확인 메서드
    public boolean isPrime(Integer number){

        if(number<2) return false;

        for(int i = 2 ; i <= Math.sqrt(number) ; i++){

        if(number % i ==0){
            return false;
        }
        }
        return true;
    }

    public void getPrimes(int acc, List<Integer> numbers, Set<Integer> primes){
        if(isPrime(acc)) primes.add(acc);

        for(int i = 0 ; i < numbers.size() ; i++){
            int nextAcc = acc*10+numbers.get(i);
            List<Integer> nextNumbers = new ArrayList<>(numbers);
            numbers.remove(i);
            getPrimes(nextAcc, nextNumbers, primes);
        }
    }

}
