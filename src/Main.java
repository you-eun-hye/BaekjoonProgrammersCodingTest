import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        String[] arr = new String[N];

        for(int i = 0; i < N; i++){
            arr[i] = br.readLine();
        }

        System.out.println(count(arr));
        br.close();
    }

    public static int count(String[] arr){
        int result = Integer.MAX_VALUE;

        for(int i = 0; i < N-7; i++){
            for(int j = 0; j < M-7; j++){
                for(int k = 0; k < 2; k++){
                    char start = k == 0 ? 'W' : 'B';

                    int count = 0;
                    for(int a = i; a < i+8; a++){
                        for(int b = j; b < j+8; b++){
                            if(start != arr[a].charAt(b)){
                                count++;
                            }
                            start = start == 'W' ? 'B' : 'W';
                        }
                        start = start == 'W' ? 'B' : 'W';
                    }
                    result = Math.min(result, count);

                    if(result == 0) return 0;
                }
            }
        }
        return  result;
    }
}