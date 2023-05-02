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

        int reA = (A%10)*100 + ((A%100)/10)*10 + (A/100);
        int reB = (B%10)*100 + ((B%100)/10)*10 + (B/100);

        System.out.print(reA>reB?reA:reB);

    }
}