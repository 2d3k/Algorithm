문제
문자열을 입력받아 아이소그램인지 여부를 리턴해야 합니다.
아이소그램(isogram)은 각 알파벳을 한번씩만 이용해서 만든 단어나 문구를 말합니다.


원래 하려고 했던 방법 1
str = str.toLowerCase();

String[] new_str = new String[str.length()];

for (int i = 0; i < str.length(); i++) {
    new_str [i] = str.toLowerCase();
    for (int j = i + 1; j < str.length(); j++) {
        if (new_str [i] == new_str[j]) {
            return false;
        }
    }
} return true;

문제점
charAt를 사용해 변환해주는 대신 new_str이라는 새로운 배열을 선언했다
str배열 자체를 가지고 비교하려고 했는데 정상적으로 돌아가는 것도 있었지만,
일부 단어들이 T/F가 제대로 나오지 않았다.


수정한 방법 1
-> str을 char형태로 받고, 이중 for문을 사용해 str의 i번째와 j번째가 같으면 false를 반환

수도코드
for (i는 0부터 str의 길이보다 작게)
    str을 소문자로 바꿈

    for (j는 i+1부터 str의 길이보다 작게)
    -> i와 j를 비교해줘야 되기 때문에 j는 i보다 1크게 시작한다
         if(str.charAt i와 j가 같다면)
             false를 반환


방법 2
-> 향상된 for문을 사용해 str을 비교

수도코드
1. str을 소문자로 바꿔줌
2. char배열 arr에 str을 char형태로 변환한 걸 넣어줌
3. 향상된 for (ch에 arr 배열의 길이만큼 반복)
              if (str의 indexOf(ch)가 lastIndexOf(ch)와 다르다면)
                    false를 반환


향상된 for문
for (타입 변수이름 : 배열변수)
    배열의 길이만큼 반복하고자 하는 명령문;

toCharArray(): 문자열을 char형 배열로 바꿔줌

indexOf(): 앞에서부터 검색할 값을 찾음
lastIndexOf(): 끝에서부터 검색할 값을 찾음

