import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        String result = String.valueOf(A*B*C);

        for(int i = 0; i < 10; i++) {
            int count = 0;
            for(int j = 0; j < result.length(); j++) {
                if(result.charAt(j) - '0' == i) {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}