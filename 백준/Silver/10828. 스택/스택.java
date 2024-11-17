import java.io.*;
import java.util.*;

public class Main {
    static Stack<Integer> stack = new Stack<Integer>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String inputStr = st.nextToken();

            if(inputStr.equals("push")) {
                push(Integer.parseInt(st.nextToken()));
            } else if(inputStr.equals("pop")) {
                sb.append(pop()).append("\n");
            } else if(inputStr.equals("size")) {
                sb.append(size()).append("\n");
            } else if(inputStr.equals("empty")) {
                sb.append(empty()).append("\n");
            } else if(inputStr.equals("top")) {
                sb.append(top()).append("\n");
            }
        }

        System.out.print(sb);
    }

    static void push(int num) {
        stack.push(num);
    }

    static int pop() {
        if(stack.isEmpty()) {
            return -1;
        } else {
            return stack.pop();
        }
    }

    static int size(){
        return stack.size();
    }

    static int empty(){
        if(stack.isEmpty()) {
            return 1;
        } else {
            return 0;
        }
    }

    static int top(){
        if(stack.isEmpty()) {
            return -1;
        } else {
            return stack.peek();
        }
    }
}