import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int input = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < input; i++) {
            String a = br.readLine();
            StringTokenizer st = new StringTokenizer(a, " ");
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            sb.append(sum).append("\n");

        }
        System.out.println(sb);
    }
}
