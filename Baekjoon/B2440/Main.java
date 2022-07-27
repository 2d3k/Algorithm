/* 백준 2440번
문제: 첫째 줄에는 별 N개, 둘째 줄에는 별 N-1개, ..., N번째 줄에는 별 1개를 찍는 문제
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

        //별찍기 2번을 응용
        //j를 입력값(count)으로 정하고 i보다 클 때 별을 넣어줌
        for (int i = 1; i <= count; i++) {
            for (int j = count; j >= i; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
