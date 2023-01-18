> 등차, 등비의 다음 값을 구하라

### 문제 설명
등차수열 혹은 등비수열 common이 매개변수로 주어질 때, 마지막 원소 다음으로 올 숫자를 return 하도록 solution 함수를 완성해보세요.

---

### 제한사항
- 2 < common의 길이 < 1,000
- -1,000 < common의 원소 < 2,000
- common의 원소는 모두 정수입니다.
- 등차수열 혹은 등비수열이 아닌 경우는 없습니다.
- 등비수열인 경우 공비는 0이 아닌 정수입니다.

---

### 입출력 예시
```java
입출력 예 #1
[1, 2, 3, 4]는 공차가 1인 등차수열이므로 다음에 올 수는 5이다.
        
입출력 예 #2
[2, 4, 8]은 공비가 2인 등비수열이므로 다음에 올 수는 16이다.
```

---

### 설계
1. common이 (n씩)얼마씩 차이나는 지 구하기
2. 만약 common[1]과 common[0]의 차이가 common[2]와 common[1]의 차이와 같다면 return common[common.length] + 등차
3. 만약 common[1]과 common[0]을 나눈 값이 common[2]와 common[1]을 나눈 값과 같다면 -> return common[common.length] * 등비

---

### 문제풀이

```java
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
```