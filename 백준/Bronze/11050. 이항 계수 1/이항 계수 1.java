import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        System.out.print(factorial(N) / (factorial(N-K) * factorial(K)));
    }
    
    static int factorial(int num){
        // 0!은 1이라고 합니다. 한참 헤맸어요..ㅎ
        if(num <= 1) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}