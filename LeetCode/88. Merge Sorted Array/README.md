# 문제

두 개의 오름차순 정수 배열 'nums1'과 'nums2', 두 개의 정수 'm'과 'n'이 각각 'nums1'과 'nums2'의 요소를 나타냅니다.
'nums1과 nums2'를 하나의 배열로 병합하여 감소하지 않는 순서로 정렬합니다.
최종 정렬된 배열은 함수에 의해 반환되지 않고 배열 'nums1' 안에 저장되어야 한다. 
이를 수용하기 위해 'nums1'의 길이는 'm + n'이며, 여기서 첫 번째 'm' 요소는 병합되어야 하는 요소를 나타내고 마지막 'n' 요소는 '0'으로 설정되어 무시되어야 한다. 'nums2'의 길이는 'n'이다.

---

Example 1:

Input: nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
Output: [1,2,2,3,5,6]
Explanation: The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6] with the underlined elements coming from nums1.

Example 2:

Input: nums1 = [1], m = 1, nums2 = [], n = 0
Output: [1]
Explanation: The arrays we are merging are [1] and [].
The result of the merge is [1].
Example 3:

Input: nums1 = [0], m = 0, nums2 = [1], n = 1
Output: [1]
Explanation: The arrays we are merging are [] and [1].
The result of the merge is [1].
Note that because m = 0, there are no elements in nums1. The 0 is only there to ensure the merge result can fit in nums1.

---

Constraints:

nums1.length == m + n
nums2.length == n
0 <= m, n <= 200
1 <= m + n <= 200
-109 <= nums1[i], nums2[j] <= 109

Follow up: Can you come up with an algorithm that runs in O(m + n) time?

---

# 문제풀이
```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;

        while(i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                nums1[k--] = nums2[j--];
            }
            else {
                nums1[k--] = nums1[i--];
            }
        }
        while(i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while(j >= 0) {
            nums1[k--] = nums2[j--];
        }
        
    }
}
```

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(j >= 0){
            if(i >=0 && nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
            } 
            else{
                nums1[k--] = nums2[j--];
            }
        }
    }
}
```

# 개념

합병 정렬(merge sort)
문제를 작은 2개의 문제로 분리하고 각각을 해결한 다음, 결과를 모아서 원래의 문제를 해결하는 전략

하나의 리스트를 두 개의 균등한 크기로 분할하고 분할된 부분 리스트를 정렬한 다음, 두 개의 정렬된 부분 리스트를 합하여 전체가 정렬된 리스트가 되게 하는 방법이다.
합병 정렬은 다음의 단계들로 이루어진다.
- 분할(Divide): 입력 배열을 같은 크기의 2개의 부분 배열로 분할한다.
- 정복(Conquer): 부분 배열을 정렬한다. 부분 배열의 크기가 충분히 작지 않으면 순환 호출 을 이용하여 다시 분할 정복 방법을 적용한다.
- 결합(Combine): 정렬된 부분 배열들을 하나의 배열에 합병한다.

![img.png](img.png)

