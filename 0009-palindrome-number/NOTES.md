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
​
풀이방법2: Stirng
​
1. str에 x를 문자열로 저장
2. reverse에 메서드를 사용해서 뒤집힌 str을 저장
​
```
class Solution {
public boolean isPalindrome(int x) {
String str=String.valueOf(x);
String reverse= new StringBuilder(str).reverse().toString();
if(str.equals(reverse)) {
return true;
}
else {
return false;
}
}
}
```