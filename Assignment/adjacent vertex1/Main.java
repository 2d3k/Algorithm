package com.codestates.coplit;
import java.util.*;

public class Solution {
    public int[][] createMatrix(int[][] edges) {
        //새로운 2차원 배열 선언
        int[][] graph;

        //edge에서 가장 큰 수를 구하고
        //큰 수를 기반으로 newarray 크기 결정

        //매트릭스 뼈대 만들기
        int max = 0;

        for (int i = 0; i < edges.length; i++) {
            for (int j =0; j < edges[i].length; j++) {
                if (max < edges[i][j]) {
                    max = edges[i][j];
                }
            }
        }
        graph = new int[max + 1][max + 1];

        for (int i = 0; i < edges.length; i++) {
            //조건: 0~2번째 간선의 정보
            int from = edges[i][0];
            int to = edges[i][1];
            int direction = edges[i][2];

            //일시방향 == 1
            if (direction == 0 ) {
                graph[from][to] = 1;
            }

            //일시무향 == 1
            else if (direction == 1) {
                graph[from][to] = 1;
                graph[to][from] = 1;
            }

            //간선이 없을 때 == 0
            else {
                graph[from][to] = 0;
                graph[to][from] = 0;
            }
        }
        return graph;
        //edge의 array를 리턴
    }
}