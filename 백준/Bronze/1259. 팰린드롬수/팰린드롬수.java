import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            String original = br.readLine();
            StringBuffer sb = new StringBuffer(original);
            if(original.equals("0")){
                break;
            }else if(original.equals(sb.reverse().toString())){
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}