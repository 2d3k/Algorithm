대칭인 숫자가 나오면 ture를 반환하라
​
1. x의 각 자리수를 배열에 저장
2. 배열 뒤집기
3. 뒤집은 배열과 원래 배열이 같다면 true
​
```
import java.util.stream.Stream;
​
class Solution {
public boolean isPalindrome(int x) {
if (x < 0) {
return false;
}
int[] num = Stream.of(String.valueOf(x).split("")).mapToInt(Integer::parseInt).toArray();
int[] revertNum = new int[num.length];
for (int i = 0; i < num.length; i++) {
revertNum[i] = num[num.length - 1 - i];
}
for (int i = 0; i < num.length; i++) {
if (num[i] != revertNum[i]) {
return false;
}
}
return true;
}
}
```