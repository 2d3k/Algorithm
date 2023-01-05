# 문제
주어진 정수 배열 nums에서 최대값인 하위배열을 찾고 그것을 반환하라.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

Constraints:

1 <= nums.length <= 105
-104 <= nums[i] <= 104


Follow up:
O(n) 솔루션을 찾았으면 분할 정복 접근법을 사용하여 다른 솔루션을 코딩해 보시오.

# 문제 풀이
1. 이진 최대공약수 알고리즘 (binary GCD algorithm) / 스테인 알고리즘(Stein's algorithm)
```java
class Solution {
    public int maxSubArray(int[] nums) {
        
        int currentSubarray = nums[0];
        int maxSubarray = nums[0];

        for(int i = 1; i < nums.length; i++){
            currentSubarray = Math.max(nums[i], currentSubarray + nums[i]);
            maxSubarray = Math.max(currentSubarray, maxSubarray);
        }

        return maxSubarray;

    }
}
```

2. DP (다이나믹 프로그래밍)
```java
class  Solution {
    public int maxSubArray(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        
        int largest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1] + nums[i]) {
                nums[i] = nums[i - 1] + nums[i];
            }
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }
        
        return largest;
    }
} 
```

# 개념

SubArray 하위배열
배열 내에서 연속적이고, 비어 있지 않은 요소의 시퀀스

Dynamic programming 동적 프로그래밍(DP)
하나의 큰 문제를 여러 개의 작은 문제로 나누어서 그 결과를 저장하여 다시 큰 문제를 해결할 때 사용

DP의 사용 조건

1) Overlapping Subproblems(겹치는 부분 문제)
2) Optimal Substructure(최적 부분 구조)

구현하기

1) Bottom-Up (Tabulation 방식) - 반복문 사용
2) Top-Down (Memoization 방식) - 재귀 사용

메모이제이션(Memoization)
모든 작은 문제들에 대해 한번씩만 풀면서 정답을 어딘가에 저장해 둡니다. 이를 활용하여 보다 큰 문제를 풀어 나갈때 똑같은 작은 문제에 대해 앞서 저장한 메모의 결과값을 이용

length: 배열의 길이 / length(): 배열 문자열의 길이
 