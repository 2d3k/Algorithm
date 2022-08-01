public class Solution {
    public String convertDoubleSpaceToSingle(String str) {
        String[] words = str.split("  ");
        return String.join(" ", words);