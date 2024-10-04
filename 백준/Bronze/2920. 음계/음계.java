import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String result = "";
        int presentNum = Integer.parseInt(st.nextToken());

        if(presentNum == 1) {
            int num = 1;
            for(int i = 0; i < 7; i++) {
                num++;
                presentNum = Integer.parseInt(st.nextToken());
                if(presentNum == num) {
                    result = "ascending";
                    continue;
                } else {
                    result = "mixed";
                    break;
                }
            }
        } else if(presentNum == 8) {
            int num = 8;
            for(int i = 0; i < 7; i++) {
                num--;
                presentNum = Integer.parseInt(st.nextToken());
                if(presentNum == num) {
                    result = "descending";
                    continue;
                } else {
                    result = "mixed";
                    break;
                }
            }
        } else {
            result = "mixed";
        }

        System.out.print(result);
    }
}