import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        String N = st.nextToken();
        int B = Integer.parseInt(st.nextToken());
        int answer = 0;
        int tmp = 1;

        for(int i = N.length()-1; i>=0; i--){
            char c = N.charAt(i);
            if('A' <= c && c <= 'Z'){
                answer+=(c-'A'+10)*tmp;
            }
            else{
                // char형을 int형으로 보면 아스키코드값이 나오므로
                // '0' 혹은 48을 빼주어야 원하는 값이 나온다
                answer+=(c-'0')*tmp;
            }
            tmp*=B;
        }

        System.out.print(answer);
        br.close();
    }
}