import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");;
        int count = 0;

        for(int i = 0; i < N; i++){
            int num = Integer.parseInt(st.nextToken());
            int check = 0;
            for(int j = 1; j <=num; j++){
                if(num%j == 0) check++;
            }
            if(check == 2) count++;
        }
        System.out.print(count);

        br.close();
    }
}