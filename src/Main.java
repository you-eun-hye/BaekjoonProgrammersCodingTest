import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[26]; // 알파벳 개수 총 26개
        char st = '?';
        int max = -1;
        String str = br.readLine().toUpperCase(); // 대문자로 전환하여 받음

        for(int i = 0; i < str.length(); i++){
            // A는 인덱스 0이므로 해당하는 10진수인 65를 빼준다.
            // 아래 코드처럼 A를 뺴주어도 된다.
            arr[str.charAt(i)-'A']++;
            if(max<arr[str.charAt(i)-'A']) {
                max = arr[str.charAt(i) - 'A'];
                st = str.charAt(i);
            }
            else if(max==arr[str.charAt(i)-'A']) st='?';
        }
        System.out.print(st);
    }
}