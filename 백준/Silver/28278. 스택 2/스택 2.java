import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    static LinkedList<Integer> stack = new LinkedList<>(); //연결리스트
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        while(N -->0){
            solution(br.readLine());
        }
        br.close();
        System.out.println(sb);
    }
    static void solution(String query){
        char c = query.charAt(0); //첫번째 문자는 명령어

        switch (c){
            case '1' : stack.push(Integer.parseInt(query.substring(2))); return; //공백도 문자로 포함되기 때문에
            case '2' : sb.append(stack.isEmpty()? -1 : stack.pop()).append("\n"); return; //스택에 정수가 들어있다면 맨 위의 정수를 출력
            case '3' : sb.append(stack.size()).append("\n"); return; // 스택에 들어있는 정수의 개수를 출력한다
            case '4' : sb.append(stack.isEmpty()? 1 :0).append("\n"); return; //스택이 비어있으면 1, 아니면 0을 출력한다.
            case '5' : sb.append(stack.isEmpty() ? -1 : stack.peek()).append("\n") ; return; //가장 맨 위 스택을 출력
        }
    }
}