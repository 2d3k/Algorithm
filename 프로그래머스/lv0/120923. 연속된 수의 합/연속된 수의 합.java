class Solution {
    public int[] solution(int num, int total) {

        int[] answer = new int[num];

        // total에서 num을 나누면 중앙값
        int median = total / num;
        // 짝수일 때와 홀수일 때 중앙값의 위치: median에서 빼면 시작 숫자가 나옴
        int subtract = total % num == 0 ? num / 2 : num / 2 - 1;
        int start = median - subtract;

        for (int i = 0; i < num; i++) {
            answer[i] = start + i;
        }
        return answer;
    }
}