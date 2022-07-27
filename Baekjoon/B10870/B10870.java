/* 백준 10870번 (피보나치 5번)
문제: Fn = Fn-1 + Fn-2 (n ≥ 2)  n번째 피보나치 수를 구하는 프로그램
입력: 첫째 줄에 n이 주어진다. n은 20보다 작거나 같은 자연수 또는 0
출력: 첫째 줄에 n번째 피보나치 수를 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//* import 깔끔하게 하는 방법

public class B10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));   //InputStreamReader: 1byte씩 읽음

        int num = Integer.parseInt(br.readLine());  //한 줄씩 읽어 옴

        System.out.println(fibonacci(num));
    }
    public static int fibonacci(int num){
        if (num == 0) return 0;
        if (num == 1) return 1;

        return fibonacci(num -1) + fibonacci(num -2);
    }
}

/*
1. if문 -> 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1 (break)
2. return (n-2) + 함수(n-1)
3. n번째 피보나치를 불러올 방법: n+1번째 배열을 불러오기
 */