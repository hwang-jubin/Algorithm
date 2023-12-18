package org.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution10Plus {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for(int i = 0 ; i<commands.length ; i++){
            int[] command = Arrays.copyOfRange(array, commands[i][0], commands[i][1]);
            Arrays.sort(command);
            answer[i] = command[commands[i][2]];
        }

        return answer;
    }
}
