class Solution {
    public int searchInsert(int[] nums, int target) {
        //  타겟의 숫자가 있는 nums 배열의 번호를 찾아라
        
        int start = 0;
        int end = nums.length - 1;
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] > target) {
                end = mid - 1;
            }
            else {
                start = mid + 1;
            }
        }
        return start;
    }
}