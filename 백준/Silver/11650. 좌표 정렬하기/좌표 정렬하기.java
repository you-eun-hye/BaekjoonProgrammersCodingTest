import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[][] numList = new int[N][2];

        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            numList[i][0] = Integer.parseInt(st.nextToken());
            numList[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(numList, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if(o1[0] == o2[0]) {
                    return o1[1] - o2[1];
                }
                else {
                    return o1[0] - o2[0];
                }
            }
        });

        for(int j = 0; j < N; j++){
            System.out.println(numList[j][0] + " " + numList[j][1]);
        }
    }
}