import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N; i++) {
            System.out.println(checkBracket(br.readLine()));
        }
    }

    static String checkBracket(String testBracket){
        Queue<Character> resultQueue = new LinkedList<>();

        for(int i = 0 ; i < testBracket.length(); i++) {

            char c = testBracket.charAt(i);

            if(c == '(') {
                resultQueue.offer(c);
            } else if(resultQueue.isEmpty()) { // ')'인데 비어있을 경우
                return "NO";
            } else { // ')'일 경우 짝이 맞으니 queue 하나 삭제
                resultQueue.poll();
            }
        }

        if(resultQueue.isEmpty()) {
            return "YES";
        } else {
            return "NO";
        }
    }
}