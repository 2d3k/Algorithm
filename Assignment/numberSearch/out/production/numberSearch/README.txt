문제: 문자열에서 숫자를 모두 찾아 더한 뒤에 해당 값을 문자열의 길이로 나눈 값을 반올림하여 리턴

설계
1. 변수 선언 (숫자를 찾아낼 String digit, 총합을 구할 double sum, 숫자를 뺀 문자열 pure str)
2. for문을 사용하여 문자열 순회
    2-1. if (str에 숫자가 있다면)
            str을 int로 바꾸고 sum에 더해줌
    2-2 else if (str이 공백이 아니라면)
                pure_str에 해당 문자열을 더해줌
3. result에 총합 나누기 문자열의 길이를 넣음
4. math.round를 사용해서 반올림을 해준다

indefxOf(): 값이 존재하면 해당 인덱스를 리턴, 값이 없다면 -1을 리턴
str -> char -> int: Character.getNumericValue(str.charAt(i))
Math.round((result * 10) /10): 소수점 첫번째 자리에서 반올림 해줌. 두번째 자리에서 하려면 10을 100으로 바꿔주면 됨