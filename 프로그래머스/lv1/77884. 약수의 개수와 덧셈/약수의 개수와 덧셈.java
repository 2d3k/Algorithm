class Solution {
    public int solution(int left, int right) {
        int answer = 0;
        int count;

        for (int i = left; i <= right; i++) {
            // left부터 right까지 반복해야 되기 때문에 count 초기화
            count = 0;
            // 약수를 찾는 반복문
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            // 약수의 개수가 짝수인 경우 answer에 더하고 아니면 뺌
            answer = (count % 2 == 1) ?  answer - i : answer + i;
//            if (count % 2 == 0) {
//                answer += i;
//            } else answer -= i;
        }
        return answer;
    }
}