/* 백준 2439번
문제: 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제(오른쪽으로 정렬)
입력: 첫째 줄에 N(1 ≤ N ≤ 100)
출력: 첫째 줄부터 N번째 줄까지 차례대로 별을 출력
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        //입력을 받을 BufferedReader 생성
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            //k의 값을 입력값(count)로 시작해서 i의 값보다 크면 감소할 때 공백 넣어줌
            for (int k = count; k > i; k--) {
                sb.append(" ");
            }
            for (int j = 1; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
