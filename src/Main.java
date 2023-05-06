import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int num = Integer.parseInt(br.readLine());

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < num-i; j++){
                bw.write(' ');
            }
            for(int k = 0; k < i*2-1; k++){
                bw.write('*');
            }
            bw.newLine();
        }

        for(int i = num-1; i >= 0; i--){
            for(int j = 0; j < num-i; j++){
                bw.write(' ');
            }
            for(int k = 0; k < i*2-1; k++){
                bw.write('*');
            }
            bw.newLine();
        }

        br.close();
        bw.flush();
        bw.close();

    }
}