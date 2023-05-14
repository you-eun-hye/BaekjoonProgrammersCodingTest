import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] arr = new int[9][9];
        int max = 0;
        int first = 0;
        int second = 0;

        for(int i = 0; i < 9; i++){
            st = new StringTokenizer(br.readLine());
            for(int j = 0; j < 9; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max){
                    max = arr[i][j];
                    first = i+1;
                    second = j+1;
                }
                else if(max == 0){
                    first = 1;
                    second = 1;
                }
            }
        }
        System.out.println(max);
        System.out.println(first + " " + second);

        br.close();
    }
}