> 배열을 i~j까지 자르고 그 다음인 k번째 숫자를 구하라

### 문제 설명

배열 array의 i번째 숫자부터 j번째 숫자까지 자르고 정렬했을 때, k번째에 있는 수를 구하려 합니다.

예를 들어 array가 [1, 5, 2, 6, 3, 7, 4], i = 2, j = 5, k = 3이라면

1. array의 2번째부터 5번째까지 자르면 [5, 2, 6, 3]입니다.
2. 1에서 나온 배열을 정렬하면 [2, 3, 5, 6]입니다.
3. 2에서 나온 배열의 3번째 숫자는 5입니다.

배열 array, [i, j, k]를 원소로 가진 2차원 배열 commands가 매개변수로 주어질 때, commands의 모든 원소에 대해 앞서 설명한 연산을 적용했을 때 나온 결과를 배열에 담아 return 하도록 solution 함수를 작성해주세요.
---

### 제한사항

- array의 길이는 1 이상 100 이하입니다.
- array의 각 원소는 1 이상 100 이하입니다.
- commands의 길이는 1 이상 50 이하입니다.
- commands의 각 원소는 길이가 3입니다.

---

### 입출력 예 설명

![img.png](img.png)

[1, 5, 2, 6, 3, 7, 4]를 2번째부터 5번째까지 자른 후 정렬합니다. [2, 3, 5, 6]의 세 번째 숫자는 5입니다.
[1, 5, 2, 6, 3, 7, 4]를 4번째부터 4번째까지 자른 후 정렬합니다. [6]의 첫 번째 숫자는 6입니다.
[1, 5, 2, 6, 3, 7, 4]를 1번째부터 7번째까지 자릅니다. [1, 2, 3, 4, 5, 6, 7]의 세 번째 숫자는 3입니다
---

### 설계 / 아이디어

1. array를 commands[[i,j,k],[i,j,k],[i,j,k]]에 따라 i부터 j까지 자름
2. 잘라진 array를 정렬
3. k번째 숫자를 result[]에 저장

---

### 문제 풀이

copyOfRage 사용
```java
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int[] temp = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(temp);
            answer[i] = temp[commands[i][2] - 1];
        }

        return answer;
    }
}
```

Arrays.sort 사용
```java
import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int i = 0, j = 0, k = 0;

        for (int a = 0; a < commands.length; a++) {
            i = commands[a][0];
            j = commands[a][1];
            k = commands[a][2];

            // 자른 값을 받을 배열 선언
            int[] temp = new int[j - i + 1];

            // 배열에 array 값을 i~j까지 저장
            for (int b = 0; b < temp.length; b++) {
                temp[b] = array[b + i - 1];
            }
            
            Arrays.sort(temp);

            // K번째 찾기
            answer[a] = temp[k - 1];
        }
        return answer;
    }
}
```