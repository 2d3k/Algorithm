class Solution {
    public String[] solution(String my_str, int n) {
        // 문자열을 n으로 나눈 수가 홀수라면 길이가 늘어나기 때문에 1을 추가한다
        int len = (my_str.length() % n == 0) ? my_str.length() / n : (my_str.length() / n) + 1;

        String[] answer = new String[len];

        int idx = 0;
        for(int i = 0; i < my_str.length(); i += n) {
            answer[idx++] = my_str.substring(i, Math.min(i + n, my_str.length()));
        }
        return answer;
    }
}