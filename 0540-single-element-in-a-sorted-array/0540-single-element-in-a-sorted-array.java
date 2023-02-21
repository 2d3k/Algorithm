class Solution {
    public int singleNonDuplicate(int[] nums) {
        int once = 0;
        
        if (nums.length == 1) {
            return nums[0];
        }
        
        for (int i = 0; i < nums.length; i++) {
            
            if (i >= nums.length - 1) {
                return nums[nums.length - 1];
            }
            
            if (nums[i] == nums[i + 1]) {
                i = i + 1;
            }
            
            else {
                once = nums[i];
                return once;
            }
        }
        return once;
    }
}