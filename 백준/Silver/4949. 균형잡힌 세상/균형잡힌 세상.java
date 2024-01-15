import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        while (true) {
            String N = br.readLine();
            Stack<Character> stack = new Stack<>();
            if (N.equals("."))
                break;
            for (int i = 0; i < N.length(); i++) {
                char ch = N.charAt(i);
                if (ch == '(' || ch == '[') {
                    stack.push(ch);
                } else if (ch == ')') {
                    if (stack.empty()) {
                        stack.push(ch);
                        break;
                    }
                    if (stack.peek() == '(') stack.pop();
                    else break;
                } else if (ch == ']') {
                    if (stack.empty()) {
                        stack.push(ch);
                        break;
                    }
                    if (stack.peek() == '[') stack.pop();
                    else break;
                }
            }
            if (!stack.empty()) sb.append("no").append("\n");
            else {
                sb.append("yes").append("\n");
            }
        }
        System.out.println(sb);
    }
}