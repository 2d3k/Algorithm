/*배열 10818번
문제: N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램을 작성
입력: 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수
출력: 첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);    //사용자 입력을 받아 올 스캐너
        int num = in.nextInt();                 //nextInt()로 int를 입력 받음

        int[] arr = new int[num];               //arr배열에 스캐너로 입력받은 수가 들어감

        for (int i=0; i < num; i++){            //i번째까지의 수를 배열에 읽어 옴
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);                       //순차적으로 수를 정렬
        System.out.print(arr[0] + " " + arr[num -1]);   //첫번째(최소) 마지막(최대)
    }
}
/*
1. N개의 정수가 들어가는 배열
2. 최댓값 최솟값을 구하기 -> for문을 사용해서 비교
-> 비교해서 풀려고 했는데, 구상이 잘 안돼서 sort로 바꿈
3. 출력할 때 공백을 넣어줘야 됨
 */