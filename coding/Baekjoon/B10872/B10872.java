/*재귀 10872번
문제: 0보다 크거나 같은 정수 N. N!을 출력하는 프로그램을 작성
입력: 첫째 줄에 정수 N(0 ≤ N ≤ 12)
출력: 첫째 줄에 N!을 출력
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        in.close();

        int sum = factorial(N);
        System.out.println(sum);
    }
    public static int factorial(int number) {
        if (number <= 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}

/*
1. n! : n번째까지의 수를 곱함
2. n* n-1 * n-2 ... -> for문을 사용해서 -> i번째까지 계속 서로 곱하게
3. n이 0일 때는 1을 반환 (if문으로 작성 -> break)
 */
