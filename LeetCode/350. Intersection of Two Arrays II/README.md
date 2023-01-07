# 문제

두 개의 정수 배열 num1과 num2가 주어지면 교차점의 배열을 반환합니다. 
결과의 각 요소는 두 배열에 표시된 횟수만큼 나타나야 하며, 원하는 순서로 결과를 반환할 수 있습니다.

---

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]

Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.

---

Constraints:

1 <= nums1.length, nums2.length <= 1000
0 <= nums1[i], nums2[i] <= 1000

---

Follow up:

지정된 배열이 이미 정렬되어 있으면, 알고리즘을 어떻게 최적화하시겠습니까?
만약 num1의 크기가 num2의 크기에 비해 작다면, 어떤 알고리즘이 더 나은가요?
num2의 요소가 디스크에 저장되어 있고 메모리가 제한되어 있어서 모든 요소를 한 번에 메모리에 로드할 수 없다면 어떻게 될까요?

---

# 문제 풀이

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i = 0;
        int j = 0;
        int n1 = nums1.length;
        int n2 = nums2.length;

        List<Integer> result = new ArrayList<>();

        while(i < n1 && j < n2) {
            if(nums1[i] == nums2[j]) {
                result.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            }
            else if(nums1[i] > nums2[j]) {
                j++;
            }
        }
        return result.stream().mapToInt(n -> n).toArray();
    }
}
```