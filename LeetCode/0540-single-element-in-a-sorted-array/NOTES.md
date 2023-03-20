> 한 번만 나타나는 요소를 반환하라!
​
You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element which appears exactly once.
​
Return the single element that appears only once.
​
지속적인 정수로 정렬된 배열의 요소는 정확히 한 번 나타는 요소를 제외하고는 항상 2배이다.
오직 한 번 나타나는 하나의 요소를 반환하라
​
```java
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
​
Input: nums = [3,3,7,7,10,11,11]
Output: 10
```
​
Idea
1. nums[i]를 순회하며 nums[i] == nums[i+1]이 같다면 넘어간다
2. 다를 때 return nums[i]를 반환