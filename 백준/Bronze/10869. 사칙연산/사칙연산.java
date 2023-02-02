import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        sc.close();

        int plus = A + B;
        int minus = A - B;
        int multiple = A * B;
        int share = A / B;
        int extra = A % B;

        System.out.println(plus);
        System.out.println(minus);
        System.out.println(multiple);
        System.out.println(share);
        System.out.println(extra);
    }
}