import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        // 세로가 가로보다 크면 세로와 가로 바꾸기
        int answer = 0;
        int temp = 0;
        int[] width = new int[sizes.length];
        int[] length = new int[sizes.length];
        
        for (int i = 0; i < sizes.length; i++) {
            width[i] = sizes[i][0];
            length[i] = sizes[i][1];
                
            // 세로가 가로보다 크면 바꾸기
            if (width[i] < length[i]) {
                temp = width[i];
                width[i] = length[i];
                length[i] = temp;
            }
        }

        // 가로의 최대, 세로의 최소값 구하기
        Arrays.sort(width);
        Arrays.sort(length);
        
        answer = width[width.length - 1] * length[length.length - 1]; 
        
        return answer;
    }
}