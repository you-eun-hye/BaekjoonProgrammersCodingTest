import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[][] userList = new String[N][2];

        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            userList[i][0] = st.nextToken();
            userList[i][1] = st.nextToken();
        }

        Arrays.sort(userList, new Comparator<String[]>() {
            @Override
            public int compare(String[] l1, String[] l2) {
                return Integer.parseInt(l1[0]) - Integer.parseInt(l2[0]);
            }
        });

        for(int j = 0; j < N; j++){
            System.out.println(userList[j][0] + " " + userList[j][1]);
        }
    }
}