import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        StringBuilder sb = new StringBuilder();

        int n = str.length() / 10;

        if (str.length() <= 10) {
            sb.append(str);
        }
        else {
            for (int i = 0; i < n; i++) {
                sb.append(str.substring(i*10, i*10+10)).append("\n");
            }
            if (str.length() % 10 != 0) {
                sb.append(str.substring(n*10, str.length())).append("\n");
            }
        }
        System.out.print(sb);
    }
}