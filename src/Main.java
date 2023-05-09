import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int answer = 1;

        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                answer = 0;
                break;
            }
        }
        System.out.print(answer);
        br.close();

    }
}