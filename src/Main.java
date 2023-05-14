import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] white = new int[100][100];
        int papaerNum = Integer.parseInt(br.readLine());
        int total = 0;

        for(int i = 0; i < papaerNum; i++){
            st = new StringTokenizer(br.readLine());
            int first = Integer.parseInt(st.nextToken());
            int second = Integer.parseInt(st.nextToken());

            for(int j = first; j < first+10; j++){
                for(int k = second; k < second+10; k++){
                    if(white[j][k] == 0){
                        white[j][k] = 1;
                        total++;
                    }
                }
            }
        }
        System.out.print(total);

        br.close();
    }
}