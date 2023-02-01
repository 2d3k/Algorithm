import java.util.*;

class Solution {
    public String[] solution(String my_str, int n) {
        int len = (my_str.length() % n == 0) ? my_str.length() / n : (my_str.length() / n) + 1;

        String[] answer = new String[len];

        int idx = 0;
        for(int i = 0; i < my_str.length(); i += n) {
            answer[idx++] = my_str.substring(i, Math.min(i + n, my_str.length()));
        }

        return answer;
    }
}