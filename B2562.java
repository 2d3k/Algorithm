/*배열2562번
문제 : 9개의 서로 다른 자연수가 주어질 때, 이들 중 최댓값을 찾고 그 최댓값이 몇 번째 수인지
입력 : 첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어짐
출력 : 첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지
 */

import java.util.Scanner;

public class B2562 {
    public static void main(String[] args) {

        //수를 입력받기
        /*
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int[] arr = new int[9];

        for (int i = 1; i < arr.length; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        */
        Scanner in = new Scanner(System.in);
        int[] arr = { in.nextInt(),in.nextInt(),in.nextInt(),
                in.nextInt(),in.nextInt(),in.nextInt(),
                in.nextInt(),in.nextInt(),in.nextInt() };
        in.close();

        //향상된 for문을 사용해 최대값 찾기
        int count = 0;
        int max = 0;
        int index = 0;

        for (int value : arr){
            count ++;

            if (value > max) {
                max = value;
                index = count;
            }
        }
        System.out.print(max + "\n" + index);
    }
}
/*
1. 스캐너로 num을 받기
2. for문 9번까지 반복해서 입력하기
3. 첫째줄 최대값, 둘째줄 최대값이 몇 번째 수인지
 */
//for(대입받을 변수정의 : 배열명)