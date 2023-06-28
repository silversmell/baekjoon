import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 2; i <= N; i++) {
            while(N % i == 0) {/* i=2 로 나누어서 안나누어지면 밖으로 나간다. i=3을 넣어본다 안나누어지면 밖으로 나간다. */
                System.out.println(i);
                N = N/i;
            }
        }
    }
}