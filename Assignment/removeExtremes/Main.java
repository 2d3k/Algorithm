public class Main {
    public String[] removeExtremes(String[] arr) {

        if (arr.length == 0) return null;

        int shortestLen = 20;
        int longestLen = 0;

        int shortestIdx = 0;
        int longestIdx = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() <= shortestLen) {
                shortestLen = arr[i].length();
                shortestIdx = i;
            }
            if (arr[i].length() >= longestLen) {
                longestLen = arr[i].length();
                longestIdx = i;
            }
        }
        String[] result = new String[arr.length - 2];
        int curIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (i != shortestIdx && i != longestIdx) {
                result[curIndex] = arr[i];
                curIndex++;
            }
        }
        return result;
    }
}