import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int[] arr = new int[num];

        for (int i=0; i < num; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        Arrays.sort(arr);
        System.out.print(arr[0] + " " + arr[num -1]);
    }
}