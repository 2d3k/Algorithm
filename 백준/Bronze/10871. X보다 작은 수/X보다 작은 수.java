import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());   //수열에 받을 개수 : N
        int X = Integer.parseInt(st.nextToken());   //정수: 수열과 비교할 정수 X

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < N; i++) {
            int result = Integer.parseInt(st.nextToken());

            if (result < X) {
                sb.append(result).append(' ');
            }
        }
        System.out.print(sb);
    }
}