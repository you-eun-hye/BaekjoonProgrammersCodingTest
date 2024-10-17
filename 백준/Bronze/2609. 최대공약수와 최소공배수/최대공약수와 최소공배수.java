import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int maxNum = gcd(num1, num2);

        System.out.println(maxNum);
        System.out.print((num1*num2)/maxNum);
    }
    
    static int gcd(int a, int b){
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
}