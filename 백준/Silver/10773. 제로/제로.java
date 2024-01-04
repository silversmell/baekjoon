import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;


public class Main {
    static LinkedList<Integer> stack = new LinkedList<>(); //연결리스트
    public static void main(String[] args) throws IOException {
        int sum = 0;
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
     int N= Integer.parseInt(br.readLine());
     while(N-->0){
         String command = br.readLine();
         if(command.equals("0")){
             stack.pop();
         }
         else{
             stack.push(Integer.valueOf(command));
         }
     }
     for(int o : stack){
         sum+= o;
     }
        System.out.println(sum);


    }

}


