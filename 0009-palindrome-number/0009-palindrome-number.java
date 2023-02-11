class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        
        int[] num = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
        int[] revertNum = new int[num.length];
        
        for (int i = 0; i < num.length; i++) {
            revertNum[i] = num[num.length - 1 - i];
        }
        
        for (int i = 0; i < num.length; i++) {
            if (num[i] != revertNum[i]) {
            return false; 
            }
        } 
        return true;
    }
}