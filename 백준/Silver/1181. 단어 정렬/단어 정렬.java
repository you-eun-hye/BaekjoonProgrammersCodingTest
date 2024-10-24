import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N               = Integer.parseInt(br.readLine());
        String[] resultList = new String[N];
        for(int i = 0 ; i < N; i++) {
            resultList[i] = br.readLine();
        }

        Arrays.sort(resultList, new Comparator<String>(){
            @Override
            public int compare(String str1, String str2) {
                if(str1.length() == str2.length()) {
                    return str1.compareTo(str2);
                } else {
                    return str1.length() - str2.length();
                }
            }
        });

        System.out.println(resultList[0]);

        for(int j = 1; j < N; j++) {
            if(!resultList[j].equals(resultList[j-1])) {
                System.out.println(resultList[j]);
            }
        }
    }
}