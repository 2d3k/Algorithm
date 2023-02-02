import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= count; i++) {
            for (int j = count; j >= i; j--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}