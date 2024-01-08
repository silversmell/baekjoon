import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0;i<N;i++){
            String S = br.readLine();
            Stack<Character> stack = new Stack<Character>();
            for(int j = 0;j<S.length();j++){
                if(S.charAt(j) == '('){
                    stack.push(S.charAt(j));
                }
                else{
                    if(stack.isEmpty()){
                        stack.push(S.charAt(j));
                        break;
                    }else{
                        stack.pop();
                    }

                }
            }
            if(stack.isEmpty())
                System.out.println("YES");
            else
                System.out.println("NO");
        }

    }
}