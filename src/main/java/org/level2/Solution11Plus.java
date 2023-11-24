package org.level2;

//삼각 달팽이
//https://school.programmers.co.kr/learn/courses/30/lessons/68645

public class Solution11Plus {

    //index 0 : 아래 ,1: 위, 2: 왼쪽 대각선 위
        private final static int[] dy= {1,0,-1};
        private final static int[] dx= {0,1,-1};

        public int[] solution(int n) {
            int[][] arr = new int[n][n];

            int x = 0;
            int y = 0;
            int d = 0;

            int num = 1;

            int ny = 0;
            int nx = 0;

            //무한 루프 돌다가, 특정 조건이 나오면 break 문으로 빠져 나옴
            while(true) {
                arr[y][x] = num++;
                ny = y+dy[d];
                nx = x+dx[d];
                //방향 전환
                if(ny==n || nx==n || ny==-1 || nx==-1 || arr[ny][nx]!=0){
                    d=(d+1)%3;
                    ny=y+dy[d];
                    nx=x+dx[d];
                    //방향 전환 후 또 조건식에 걸리면 다 채워진 것으로 간주하고 while 문 break
                    if(ny==n || nx==n || ny==-1 || nx==-1 || arr[ny][nx]!=0) break;
                }
                //다음 index 반영
                y=ny;
                x=nx;
            }

            int[] answer = new int[num-1];
            int index = 0 ;

            //배열의 number만큼 이중배열의 크기가 결정 됨
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j<=i; j++){
                    answer[index++] = arr[i][j];
                }
            }
            return answer;
        }
    }

