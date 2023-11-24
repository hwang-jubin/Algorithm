package org.level2;

//https://school.programmers.co.kr/learn/courses/30/lessons/87377#
//교점에 별 만들기

import java.util.ArrayList;
class Solution12 {
    public String[] solution(int[][] line) {

        long[] max ={Long.MIN_VALUE,Long.MIN_VALUE};
        long[] min = {Long.MAX_VALUE,Long.MAX_VALUE};

        ArrayList<long[]> arr = new ArrayList();

        for(int i = 0 ; i<line.length ; i++){
            for(int j = i+1 ; j<line.length; j++){
                long[] intersection = intersection(line[i], line[j]);
                if(intersection!=null){
                    arr.add(intersection);

                    max[0]=Math.max(max[0],intersection[0]);
                    max[1]=Math.max(max[1],intersection[1]);

                    min[0]=Math.min(min[0],intersection[0]);
                    min[1]=Math.min(min[1],intersection[1]);

                }
            }
        }

        char[][] answer = new char[(int)(max[1]-min[1])+1][(int)(max[0]-min[0])+1];

        for(int i = 0 ; i < answer.length ; i++){
            for(int j = 0 ; j < answer[i].length ; j++){
                answer[i][j] = '.';
            }
        }

        for(int i = 0 ; i < arr.size() ; i++){
            long[] point = arr.get(i);
            answer[(int)(max[1]-point[1])][(int)( point[0]-min[0])]='*';

        }

        String[] result = new String[answer.length];


        result[0] = new String(answer[0]);

        for(int i = 0 ; i <result.length; i++){
            result[i] = new String(answer[i]);
        }

        return result;
    }

    private long[] intersection(int[] arr1, int[] arr2){

        long[] arr = new long[2];
        // 일단 분모 부분을 먼저 계산해서 0인지 아닌지 체크, 0이면 로직 종료.
        // 정수해인지 확인하기 위해서 몫과 나머지를 구하고
        // 나머지가 0이 아니면 로직 종료.
        // 나머지가 0이면, 몫을 x 또는 y에 저장한다.
        double x = (double)((arr1[1] * arr2[2]) - (arr1[2] * arr2[1])) / ((arr1[0] * arr2[1]) - (arr1[1] * arr2[0]));//x
        double y  = (double)((arr1[2] * arr2[0]) - (arr1[0] * arr2[2])) / ((arr1[0] * arr2[1]) - (arr1[1] * arr2[0]));//y

        if(x%1!=0 || y%1!=0){
            return null;
        }else{
            arr[0]=(long)x;
            arr[1]=(long)y;
        }
        return arr;
    }

}