/* 백준 11729번 하노이의 탑
문제: 하노이의 탑 옮기기. 이동 횟수는 최소
입력: 첫째 줄에 첫 번째 장대에 쌓인 원판의 개수 N (1 ≤ N ≤ 20)
출력: 첫째 줄에 옮긴 횟수 K를 출력. 두 번째 줄부터 수행 과정을 출력
 */
import java.util.Scanner;

public class B11729 {
    public static StringBuilder sb = new StringBuilder();
    //StringBuilder?
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        //원판 이동 회수 구하기기
       sb.append((int) (Math.pow(2,num) - 1)).append('\n');

        Hanoi(num, 1, 2, 3);
        System.out.println(sb);
    }
    public static void Hanoi(int num, int start, int mid, int to) {
        //원판의 개수가 1개라면, 시작점과 도착점만 구함
        if (num ==1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        //num-1개의 원판을 중간지점으로 옮김
        Hanoi(num -1, start, to, mid);

        //시작점의 원판 1개를 도착점으로 옮김
        sb.append(start + " " + to + "\n");

        //n-1개의 중간점에서 도착점으로 옮김
        Hanoi(num -1, mid, start, to);
    }
}

