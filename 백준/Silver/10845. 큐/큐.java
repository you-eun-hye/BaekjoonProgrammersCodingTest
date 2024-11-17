import java.io.*;
import java.util.*;

public class Main {
    static Queue<Integer> resultQueue = new LinkedList<>();
    static int lastNum;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String inputStr = st.nextToken();

            if(inputStr.equals("push")) {
                lastNum = Integer.parseInt(st.nextToken());
                push(lastNum);
            } else if(inputStr.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if(inputStr.equals("size")) {
                sb.append(size()).append("\n");
            } else if(inputStr.equals("empty")) {
                sb.append(empty()).append("\n");
            } else if(inputStr.equals("front")) {
                sb.append(front()).append("\n");
            } else if(inputStr.equals("back")) {
                sb.append(back(lastNum)).append("\n");
            }
        }

        System.out.print(sb);
    }

    static void push(int num) {
        resultQueue.add(num);
    }

    static int pop() {
        if(resultQueue.isEmpty()) {
            return -1;
        } else {
            return resultQueue.remove();
        }
    }

    static int size(){
        return resultQueue.size();
    }

    static int empty(){
        if(resultQueue.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    static int front(){
        if(resultQueue.isEmpty()) {
            return -1;
        } else {
            return resultQueue.peek();
        }
    }

    static int back(int num){
        if(resultQueue.isEmpty()) {
            return -1;
        } else {
            return num;
        }
    }
}