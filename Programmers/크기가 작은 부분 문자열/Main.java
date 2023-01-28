import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int result = 0;
        int length = p.length();
        long num = Long.parseLong(p);

        for (int i = 0; i <= t.length() - length; i++) {
            long diff = Long.parseLong(t.substring(i, i + length));
            if (diff <= num) {
                result++;
            }
        }
        return result;
    }
}