import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        // 체육복을 가진 전체 인원
        int result = n - lost.length;

        // 정렬이 되어있지 않은 경우를 생각해서 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        // 여벌이 있었지만 도난당한 사람
        // reserve더라도 lost에 포함되어 있기 때문에 result에 추가함.
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j]) {
                    lost[i] = reserve[j] = -1;
                    result++;
                    break;
                }
            }
        }

        // 도난당한 사람에게 체육복을 준 경우
        for (int i = 0; i < lost.length; i++) {
            for (int j = 0; j < reserve.length; j++) {
                if (lost[i] == reserve[j] + 1 || lost[i] == reserve[j] - 1) {
                    lost[i] = reserve[j] = -1;
                    result++;
                    break;
                }
            }
        }
        return result;
    }
}