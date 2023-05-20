import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        int days = (V-A)/(A-B); // 도착 하루 전

        // 정상에 올랐을 경우 미끄러지지 않음
        if((V-A)%(A-B) != 0) days++;

        System.out.print(days+1);

        br.close();
    }
}