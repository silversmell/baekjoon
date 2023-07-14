import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        StringTokenizer st = new StringTokenizer(a," ");
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i = 0;i<N;i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }//문자 한개씩 숫자로 바꿈.
        Arrays.sort(arr);
        System.out.println(arr[arr.length-K]);
    }
    }
