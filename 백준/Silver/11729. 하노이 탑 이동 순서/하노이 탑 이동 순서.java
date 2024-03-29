import java.util.Scanner;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        sb.append((int) (Math.pow(2,num) - 1)).append('\n');

        Hanoi(num, 1, 2, 3);
        System.out.println(sb);
    }
    public static void Hanoi(int num, int start, int mid, int to) {
        if (num ==1) {
            sb.append(start + " " + to + "\n");
            return;
        }
        Hanoi(num -1, start, to, mid);

        sb.append(start + " " + to + "\n");

        Hanoi(num -1, mid, start, to);
    }
}