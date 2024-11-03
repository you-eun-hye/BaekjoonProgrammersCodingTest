import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> numQueue = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());

        for(int i = 1; i <= N; i++) {
            numQueue.offer(i); // 원소 삽입
        }

        while(numQueue.size() > 1) {
            numQueue.poll(); // 제일 앞 원소 버림
            numQueue.offer(numQueue.poll()); // 제일 앞 원소를 버리고 그 원소를 제일 뒤로 삽입
        }

        System.out.println(numQueue.poll()); // Queue에 남은 거 출력
    }
}