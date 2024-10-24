import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int i = 0 ; i < N; i++) {
            resultList.add(Integer.parseInt(br.readLine()));
        }

        br.close();
        
        Collections.sort(resultList);

        for(int num : resultList) {
            bw.write(num + "\n");
        }

        bw.flush();
        bw.close();
    }
}