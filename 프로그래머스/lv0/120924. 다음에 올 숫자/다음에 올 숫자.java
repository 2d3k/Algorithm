class Solution {
    public int solution(int[] common) {
        
        int difference = 0;
        int ratio = 0;


        if (common[1] - common[0] == common[2] - common[1]) {
            difference = common[1] - common[0];
            return common[common.length - 1] + difference;
        }

        if (common[1] / common[0] == common[2] / common[1]) {
            ratio = common[1] / common[0];
            return common[common.length - 1] * ratio;
        }

        return 0;

    }
}