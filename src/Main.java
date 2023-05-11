import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int C = Integer.parseInt(br.readLine());
        int[] arr;

        for(int i = 0; i < C; i++){
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            arr = new int[N];
            double avg = 0;

            for(int j = 0; j < N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                avg += arr[j];
            }

            avg/=N;
            double count = 0;

            for(int j = 0; j < N; j++){
                if(arr[j] > avg){
                    count++;
                }
            }
            System.out.printf("%.3f%%\n", (count/N)*100);
        }

        br.close();
    }
}