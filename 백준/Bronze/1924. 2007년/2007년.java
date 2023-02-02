import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int D = sc.nextInt();
        sc.close();

        int[] Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] Day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int result = D;
        for (int i = 0; i < M - 1; i++) {
            result += Month[i];
        }
        System.out.print(Day[result % 7]);
    }
}