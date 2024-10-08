import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer result = 0;
        Integer seq = 0;
        char beforeOX;
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i < num; i++) {
            String OXstr = br.readLine();
            beforeOX = OXstr.charAt(0);

            if(beforeOX == 'O') {
                result += 1;
                seq += 1;
            }

            for(int j = 1; j < OXstr.length(); j++) {
                // 연속으로 O일 경우
                if(beforeOX == 'O' && OXstr.charAt(j) == 'O') {
                    seq += 1;
                    result += seq;
                } else if (beforeOX == 'X' && OXstr.charAt(j) == 'O') { // X였다가 O가 됐을 경우
                    seq = 1;
                    result += 1;
                }
                beforeOX = OXstr.charAt(j);
            }

            System.out.println(result);
            result = 0;
            seq = 0;
        }
    }
}