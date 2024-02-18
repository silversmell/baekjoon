import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    while(true) {
    String s = bf.readLine();
    String[] b = s.split(" ");
     int a = Integer.parseInt(b[0]);
     int c= Integer.parseInt(b[1]);
     if(a==0 &&c==0) {
       break;
     }
     if(a%c==0) {
       System.out.println("multiple");
     }
     else {
       if(c%a==0) {
         System.out.println("factor");
       }
       else {
         System.out.println("neither");
       }
     }

    
  }
}
}