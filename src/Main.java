import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        String strA = st.nextToken();
        String strB = st.nextToken();
        int maxLength = Math.max(strA.length(), strB.length());
        int[] A = new int[maxLength+1];
        int[] B = new int[maxLength+1];

        int index = 0;
        for(int i = strA.length()-1; i>=0;  i--, index++){
            A[index] = strA.charAt(i) - '0';
        }

        index = 0;
        for(int i = strB.length()-1; i>=0;  i--, index++){
            B[index] = strB.charAt(i) - '0';
        }

        for(int i = 0; i < maxLength; i++){
            int value = A[i] + B[i];
            A[i] = value % 10;
            A[i+1] += value/10;
        }

        StringBuilder sb = new StringBuilder();

        if(A[maxLength] != 0) sb.append(A[maxLength]);

        for(int i = maxLength-1; i>=0; i--){
            sb.append(A[i]);
        }
        System.out.print(sb);

        br.close();
    }
}