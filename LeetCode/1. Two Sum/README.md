# 문제

정수의 배열 nums와 정수 target이 주어졌을 때, 두 숫자의 인덱스를 반환하여 합계가 'target'이 되도록 합니다.
각 입력에 정확히 하나의 솔루션이 있다고 가정할 수 있으며, 동일한 요소를 두 번 사용할 수 없습니다.
답변은 임의의 순서로 반환할 수 있습니다.

---

Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]

---

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
Only one valid answer exists.

Follow-up: Can you come up with an algorithm that is less than O(n2) time complexity?

---

# 문제 풀이
```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{i, map.get(target - nums[i])};
        }
        map.put(nums[i], i);
        }
    return null;   
    }
}
```



