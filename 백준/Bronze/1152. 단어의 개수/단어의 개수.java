import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b=a.trim();
        StringTokenizer st = new StringTokenizer(b," ");
        System.out.println(st.countTokens());


    }
}
