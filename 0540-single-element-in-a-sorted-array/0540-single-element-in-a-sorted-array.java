class Solution {
    public int singleNonDuplicate(int[] nums) {
        
        
//      binary search
        
        int start = 0;
        int end = nums.length - 1;
        
//      길이가 1인 경우
        if (nums.length == 1) {
            return nums[0];
        }
        
//      처음이 다른 경우
        if (nums[0] != nums[1]) {
            return nums[0];
        }
        
//      마지막이 다른 경우
        if (nums[end] != nums[end - 1]) {
            return nums[end];
        }
        
        while (start <= end) {
            int mid = (start + end) / 2;
            
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1] ) { 
                return nums[mid];
            }
            
            else if ((nums[mid] == nums[mid + 1] && mid % 2 == 0) || (nums[mid] == nums[mid - 1] && mid % 2 != 0)) {
                start = mid + 1;
            }
            
            else {
                end = mid - 1;
            }
        }
        return start;
    }
}

// brute-force

// class Solution {
//     public int singleNonDuplicate(int[] nums) {
        
//         int once = 0;
        
//         if (nums.length == 1) {
//             return nums[0];
//         }
        
//         for (int i = 0; i < nums.length; i++) {
            
//             if (i >= nums.length - 1) {
//                 return nums[nums.length - 1];
//             }
            
//             if (nums[i] == nums[i + 1]) {
//                 i = i + 1;
//             }
            
//             else {
//                 once = nums[i];
//                 return once;
//             }
//         }
//         return once;
//      }
//  }