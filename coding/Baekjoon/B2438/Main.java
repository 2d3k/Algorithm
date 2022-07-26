/* 백준 2438 별찍기1
문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
입력: 첫째 줄에 N(1 ≤ N ≤ 100)
출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        //StringBulilder(): 모든 문자열을 하나의 객체에 연결 -> 출력은 마지막에 한번만 함

        /*Scanner 사용
        Scanner sr = new Scanner(System.in);
        int count = sc.nextInt();
        sc.close();
         */

        //별을 j번 찍고 줄바꿈 해줌
        for (int i = 1; i <= count; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append("*");
                //scanner를 사용할 때, 만약 여기서 println을 사용하면 별1개가 i*j번 찍힘
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}

