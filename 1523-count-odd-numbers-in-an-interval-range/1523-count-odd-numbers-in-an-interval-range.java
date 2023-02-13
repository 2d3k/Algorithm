class Solution {
    public int countOdds(int low, int high) {
        int max = (high + 1) / 2;
        int min = low / 2;
        
        return max - min;
    }
}