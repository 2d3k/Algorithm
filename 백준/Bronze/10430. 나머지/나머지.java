import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        sc.close();

        int one = (A+B)%C;
        int two = ((A%C) + (B%C))%C;
        int three =(A*B)%C;
        int four = ((A%C) * (B%C))%C;

        System.out.println(one);
        System.out.println(two);
        System.out.println(three);
        System.out.println(four);

    }
}
