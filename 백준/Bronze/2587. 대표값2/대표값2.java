import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        int[] num = new int[5];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0;i< num.length;i++){
            num[i]= Integer.parseInt(br.readLine());
        }
        int sum=0;
        int avg=0;
        for(int i = 0;i< num.length;i++){
            sum+=num[i];
        }
        avg = sum/ num.length;
        System.out.println(avg);
        Arrays.sort(num);
        System.out.println(num[2]);
    }
}