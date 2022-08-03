public class Solution {
    public String insertDash(String str) {
        if (str.length() == 0) return null;

        String result = "" + str.charAt(0);

        for (int i = 1; i < str.length(); i++) {
            int prev = Character.getNumericValue(str.charAt(i - 1));
            int curr = Character.getNumericValue(str.charAt(i));

            if (prev % 2 != 0 && curr % 2 != 0) {
                result = result + '-';
            }
            result = result + str.charAt(i);
        }
        return result;
    }
}