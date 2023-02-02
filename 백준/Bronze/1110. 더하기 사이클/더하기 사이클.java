import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        br.close();

        int result = n;
        int count = 0;

        do {
            n = ((n % 10) * 10) + (((n / 10) + (n % 10)) % 10);
            count++;
        } while (result != n);

        System.out.print(count);
    }
}