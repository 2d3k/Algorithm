백준 10817번 (세 수)

문제: 세 정수 A, B, C가 주어진다. 이때, 두 번째로 큰 정수를 출력하는 프로그램을 작성하시오.
입력: 첫째 줄에 세 정수 A, B, C가 공백으로 구분되어 주어진다. (1 ≤ A, B, C ≤ 100)
출력: 두 번째로 큰 정수를 출력한다.

원래 생각했던 수도코드
- for문으로 a,b,c를 비교

1. Scanner 사용
2. a,b,c를 비교할 for문 (1~3까지 반복)
	for (1~3)
		if ( a>b || a>c || b>a || b>c || c>a || c>b )
			if ( b>c || c>b || a>c || c>a || a>b || b>a )

문제점
1. 이렇게 돌리면 숫자는 비교가 되겠지만, 결과값을 받을 수가 없다
2. 그래서 숫자를 따로 비교하는 방식을 쓰려면 아래의 방식으로 비교해야 된다
    if (a가 가장 크거나 모두 같은 경우)
    else (b가 가장 큰 수일 경우)

        if (a >= b) {
			if (a >= c) {
				if (b >= c)
					System.out.print(b);
				else
					System.out.print(c);
			} else
				System.out.print(a);
		} else {
			if (c <= b) {
				if (c <= a)
					System.out.print(a);
				else
					System.out.print(c);
			} else
				System.out.print(b);

쉬운 방법으로 바꾼 수도코드
Array.sort()를 사용
1. scanner를 사용해 배열에 값을 받아온다
2. 배열을 오름차순으로 정렬한다
3. print로 배열의 두번째를 받아오면 끝!

Array.sort(): 오름차순 정렬
Arrays.sort(arr, Collections.reverseOrder()): 내림차순 정렬



	

