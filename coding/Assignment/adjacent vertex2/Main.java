package com.codestates.coplit;
import java.util.*;

public class Solution {
    public boolean getDirections(int[][] matrix, int from, int to) {
        //현재값을 받을 2차원 배열 생성
        int[][] now = new int[matrix.length][];

        //for문을 사용해서 now에 arrays의 배열 복사
        for(int i = 0; i < matrix.length; i++) now[i] = Arrays.copyOf(matrix[i], matrix[i].length);
        //Arrays.copyOf(원본배열, 복사할 길이);
        if(from == to) return true;
        //if문을 사용해서 출발점과 도착점이 같은지 확인


        //for문을 사용해서 now의 출발점 조회
        for(int i = 0; i < now[from].length; i++) {
            //길이 있으면 == 0으로 순회한 것을 표시
            if(now[from][i] == 1) {
                now[from][i] = 0;

                //재귀함수를 사용해서 now(표시된 행렬)에서 i(현재지점)부터 도착점까지 순환
                if(getDirections(now, i, to)) return true;
            }
        }
        return false;
    }
}