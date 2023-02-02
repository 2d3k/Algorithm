import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= 9; i++) {
            int sum = num * i;
            System.out.printf("%d * %d = %d", num, i, sum);
            System.out.println();
        }
    }
}
