백준 10817번 (세 수)

문제: 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
출력: 두 번째로 큰 정수를 출력한다.

흐름
- 배열을 사용해 for문으로 배열[0]~[2]까지 비교

1. Scanner 사용
2. 정수 입력받을 for문 (1~3)
	arr[i] = scanner
2. 배열 i의 크기를 비교해줄 for문 (1~3까지 반복)
	for (1~3)
		if (a > b  || a>c ||b>a ||c>a ||c>b)
			if (b > c||c>b||a>c||c>a || a>b||b>a ||)
				int result = arr[i];

max
cur

a>b>c
a>c>b
b>a>c
b>c>a
c>a>b
c>b>a

> 향상된 for문: for(대입받을 변수정의 : 배열명)



	

