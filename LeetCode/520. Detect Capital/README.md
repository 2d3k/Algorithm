# 문제

We define the usage of capitals in a word to be right when one of the following cases holds:
다음과 같은 경우 중 하나가 해당될 때 단어의 대문자 사용을 올바른 것으로 정의한다.

All letters in this word are capitals, like "USA".
이 단어의 모든 문자는 "USA"처럼 대문자입니다.
All letters in this word are not capitals, like "leetcode".
이 단어의 모든 문자는 "letcode"처럼 대문자가 아닙니다.
Only the first letter in this word is capital, like "Google".
이 단어의 첫 글자만 "Google"처럼 대문자입니다.
Given a string word, return true if the usage of capitals in it is right.
문자열 단어가 주어지면, 대문자의 사용이 올바른 경우 true를 반환합니다.


Example 1:

Input: word = "USA"
Output: true
Example 2:

Input: word = "FlaG"
Output: false


Constraints:

1 <= word.length <= 100
word consists of lowercase and uppercase English letters.
단어는 소문자와 대문자로 구성되어 있다.

# 문제 풀이

```java
class Solution {
    public boolean detectCapitalUse(String word) {
        
        return word.matches("[A-Z]*|[A-Z][a-z]+|[a-z]+");
    }
    
}
```

`matches()`
정규표현식과 일치하는지 true/false로 확인