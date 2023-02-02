import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < num; i++) {
            for (int j = 0; j < i; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < 2*num -(2*i+1); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        for (int i = 0; i < num -1; i++) {
            for (int j = 1; j < num -1 -i; j++) {
                sb.append(" ");
            }
            for (int k = 0; k < 3 + (2 * i); k++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}