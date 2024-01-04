import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer> stack = new LinkedList<>(); //연결리스트
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); //마지막 출력할 때 필요.
       StringTokenizer st; //토큰을 읽을때 필요
        int N = Integer.parseInt(br.readLine()); //명령어의 수
        while(N -->0){
            st = new StringTokenizer(br.readLine()); //공백을 기준으로 토큰을 나눔
            String command = st.nextToken(); //토큰을 하나씩 꺼내옴.
            if(command.equals("0")){ //st 다음 토큰이 0 이면
                stack.pop();
            }
            else{
                stack.push(Integer.valueOf(command));
                //stack에 command에 값을 하나씩 넣어줌.
            }
        }
        int sum = 0;

        for(int o : stack) {
            sum += o;
        }

        System.out.println(sum);

    }

}


