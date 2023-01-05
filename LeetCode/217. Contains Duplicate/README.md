# 문제
Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
주어진 integer 배열 nums는 배열에서 어떤 값이 2번 나타날 때 true를 반환한다. 그리고 모든 요소가 중복되지 않으면 false를 반환한다.


Example 1:

Input: nums = [1,2,3,1]
Output: true

Example 2:

Input: nums = [1,2,3,4]
Output: false

Example 3:

Input: nums = [1,1,1,3,3,4,3,2,4,2]
Output: true


Constraints:

1 <= nums.length <= 105
-109 <= nums[i] <= 109

# 문제 풀이

1. List 정렬 사용
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);

        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i] == nums[i+1]) {
                return true;
            }
        }
        return false;
    }
}
```

단순하게 sort 정렬을 사용하여 배열의 i번쨰와 i+1번쨰를 비교하는 방법
가장 단순하지만, 2번째 방법과 비교해 시간이 3배보다 더 걸린다.


2. Set 사용
```java
class Solution {
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<Integer>();

        for (int num : nums) {

            if (set.contains(num)) {
                return true;
            }
            else {
                set.add(num);
            }
        } 
        return false;
    } 
}
```

자료 구조 문제를 풀고 있었기에 어떤 자료구조를 사용할 수 있는 지를 먼저 생각했다.
Map, Set, List

첫 번째에서 사용한 배열은 효율이 떨어지고, Key와 Value가 특징인 Map보다는, 중복되는 요소는 배제시키는 Set을 사용하는 게 적합하다고 생각해서 Set을 사용하여 문제를 풀었다.

`Set의 메소드인 contains()`
Set 안에 객체가 존재하는지 여부를 리턴