package org.level2;

//삼각 달팽이
//https://school.programmers.co.kr/learn/courses/30/lessons/68645

public class Solution11 {

    public int[] solution(int n) {
        int[][] arr = new int[n][n];

        int x = 0;
        int y = 0;

        int num = 1;

        while(true){

            //아래로
            while(true) {
                arr[y][x] = num;
                num++;
                if (y + 1 == n || arr[y + 1][x] != 0) break;
                y++;

            }
                if (x + 1 == n || arr[y][x+1] != 0) break;
                x++;

            //왼->오
            while(true){

                arr[y][x] = num ;
                num++;
                if (x + 1 == n || arr[y][x+1] != 0) break;
                x++;
            }

            if (arr[y-1][x-1] != 0) break;
                y--;
                x--;

            //대각선
            while(true){
                arr[y][x] = num;
                num++;
                if (arr[y-1][x-1] != 0) break;
                y--;
                x--;
            }

            if (y + 1 == n || arr[y + 1][x] != 0) break;
                y++;

        }

        int[] answer = new int[num-1];
        int index = 0 ;

        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j<=i; j++){
                answer[index++] = arr[i][j];
            }
        }

        return answer;
    }


}
