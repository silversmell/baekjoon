
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String a2 = br.readLine();
            StringTokenizer st = new StringTokenizer(a2, " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int d = gcd(a,b);
            sb.append(a*b/d).append("\n");
        }
        System.out.println(sb);
    }
    public static int gcd(int a, int b){
        int r = a%b;
        if(r==0){
            return b;
        }
        return gcd(b,r);
    }
}

