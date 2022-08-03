백준 10871번 (X보다 작은 수)

문제: 정수 N개로 이루어진 수열 A와 정수 X가 주어진다. 이때, A에서 X보다 작은 수를 모두 출력하는 프로그램을 작성
입력: 첫째 줄에 N과 X가 주어진다. (1 ≤ N, X ≤ 10,000)
     둘째 줄에 수열 A를 이루는 정수 N개가 주어진다. 주어지는 정수는 모두 1보다 크거나 같고, 10,000보다 작거나 같은 정수이다.
출력: X보다 작은 수를 입력받은 순서대로 공백으로 구분해 출력한다. X보다 작은 수는 적어도 하나 존재한다.

처음 생각한 흐름
1.변수 선언 (배열A, int X)
		
2.for (0~A.length 반복) {
	if A[i]<X)
		print(A[i] + " ")
}

문제점
1. 위의 흐름을 쓰려면 BufferedReader보다 Scanner가 적합하다
2. 처음의 문제 이해가 부족했다. A는 배열의 개수이고 배열은 따로 선언을 해야된다
3. 그리고 for문을 사용해 배열[i]의 값을 받아와야 된다.
4. 위의 조건이 만족되면 이제 원래 생각한 for문을 사용한다.

referrence (br + 배열X)
1.BufferedReader를 사용하여 입력을 받고, 띄어쓰기를 기준으로 구분하기 위해 StringTokenizer도 사용한다.
2.


StringTokenizer 생성자
1)StringTokenizer st = new StringTokenizer(문자열);            //띄어쓰기를 기준으로 분리
2)StringTokenizer st = new StringTokenizer(문자열, 구분자);     //구분자를 기준으로 분리

StringTokenizer vs split
split: 정규식을 기반으로 자르는 로직으로서 내부가 복잡
StringTokenizer: nextToken()메소드는 단순히 공백 자리를 땡겨 채우는 것이라 속도가 차이남
